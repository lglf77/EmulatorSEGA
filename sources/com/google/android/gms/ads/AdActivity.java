package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.bcr;
import com.google.android.gms.internal.jn;

public class AdActivity extends Activity {
    private bcr a;

    private final void a() {
        if (this.a != null) {
            try {
                this.a.l();
            } catch (RemoteException e) {
                jn.c("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.a.a(i, i2, intent);
        } catch (Exception e) {
            jn.c("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.a != null) {
                z = this.a.e();
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.a.a(c.a(configuration));
        } catch (RemoteException e) {
            jn.c("Failed to wrap configuration.", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = app.b().a((Activity) this);
        if (this.a == null) {
            jn.e("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.a.a(bundle);
        } catch (RemoteException e) {
            jn.c("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.a != null) {
                this.a.k();
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.a != null) {
                this.a.i();
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.a != null) {
                this.a.f();
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.a != null) {
                this.a.h();
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.a != null) {
                this.a.b(bundle);
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.a != null) {
                this.a.g();
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.a != null) {
                this.a.j();
            }
        } catch (RemoteException e) {
            jn.c("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
