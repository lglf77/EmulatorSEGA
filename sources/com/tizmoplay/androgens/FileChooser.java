package com.tizmoplay.androgens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.g;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileChooser extends Activity {
    /* access modifiers changed from: private */
    public File a;
    /* access modifiers changed from: private */
    public d b;
    private String c;
    private String d;
    /* access modifiers changed from: private */
    public String e;
    private String f;
    /* access modifiers changed from: private */
    public Stack<String> g;
    private ListView h;
    private g i;
    private h j;

    /* access modifiers changed from: private */
    public h a() {
        return this.j;
    }

    /* access modifiers changed from: private */
    public void a(h hVar) {
        Toast.makeText(this, getString(R.string.fileChooseFileClicked) + ": " + hVar.a(), 0).show();
        if (!this.i.a() || b().longValue() <= 300) {
            Intent intent = new Intent();
            intent.putExtra("Filename", hVar.c());
            setResult(-1, intent);
            finish();
            return;
        }
        this.j = hVar;
        this.i.b();
    }

    /* access modifiers changed from: private */
    public void a(File file) {
        File[] listFiles = file.listFiles();
        setTitle(getString(R.string.fileChooseCurrentDirectory) + ": " + file.getAbsolutePath());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(new h(file2.getName() + "/", getString(R.string.fileChooseFolder), file2.getAbsolutePath()));
                } else {
                    int lastIndexOf = file2.getName().lastIndexOf(46);
                    if (lastIndexOf > 0 && file2.getName().substring(lastIndexOf + 1).toLowerCase(Locale.getDefault()).matches(this.d)) {
                        arrayList2.add(new h(file2.getName(), getString(R.string.fileChooseFileSize) + ": " + file2.length(), file2.getAbsolutePath()));
                    }
                }
            }
        } catch (Exception e2) {
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        arrayList.addAll(arrayList2);
        arrayList.add(0, new h("..", getString(R.string.fileChooseParentDirectory), file.getParent()));
        this.b = new d(this, R.layout.file_view, arrayList);
        this.h.setAdapter(this.b);
        this.h.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                h a2 = FileChooser.this.b.getItem(adapterView.getPositionForView(view));
                if (!a2.b().equalsIgnoreCase(FileChooser.this.getString(R.string.fileChooseFolder)) && !a2.b().equalsIgnoreCase(FileChooser.this.getString(R.string.fileChooseParentDirectory))) {
                    String c = a2.c();
                    int lastIndexOf = c.lastIndexOf(46);
                    String str = null;
                    if (lastIndexOf >= 0) {
                        str = c.substring(lastIndexOf + 1).toLowerCase(Locale.getDefault());
                    }
                    if (str.matches("zip")) {
                        FileChooser.this.a(c);
                    } else {
                        FileChooser.this.a(a2);
                    }
                } else if (a2.c() != null) {
                    File unused = FileChooser.this.a = new File(a2.c());
                    FileChooser.this.a(FileChooser.this.a);
                    FileChooser.this.g.push(a2.c());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        Log.d("FileChooser", "fillFromZip(" + str + ")");
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            setTitle(getString(R.string.fileChooseCurrentDirectory) + ": " + str);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    Collections.sort(arrayList);
                    Collections.sort(arrayList2);
                    arrayList.addAll(arrayList2);
                    this.b = new d(this, R.layout.file_view, arrayList);
                    this.h.setAdapter(this.b);
                    this.h.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                            h a2 = FileChooser.this.b.getItem(adapterView.getPositionForView(view));
                            Emulator.unzipFile(a2.c(), a2.a(), FileChooser.this.e + "/" + a2.a());
                            FileChooser.this.a(new h(a2.a(), a2.b(), FileChooser.this.e + "/" + a2.a()));
                        }
                    });
                    return;
                } else if (!nextEntry.isDirectory()) {
                    arrayList2.add(new h(nextEntry.getName(), getString(R.string.fileChooseFileSize) + ": " + nextEntry.getSize(), str));
                }
            }
        } catch (Exception e2) {
            Log.e("Decompress", "unzip", e2);
        }
    }

    private Long b() {
        Long b2 = ((App) getApplication()).b();
        Long a2 = ((App) getApplication()).a();
        if (a2 == null) {
            a2 = 0L;
        }
        return Long.valueOf(b2.longValue() - a2.longValue());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.file_choose);
        this.h = (ListView) findViewById(R.id.fileChooserView);
        c a2 = new c.a().a();
        this.i = new g(this);
        this.i.a("ca-app-pub-8207906625354307/5734849789");
        this.i.a(a2);
        this.i.a((a) new a() {
            public void a() {
            }

            public void a(int i) {
            }

            public void b() {
            }

            public void c() {
                ((App) this.getApplication()).a(((App) this.getApplication()).b());
                h a2 = FileChooser.this.a();
                Intent intent = new Intent();
                intent.putExtra("Filename", a2.c());
                FileChooser.this.setResult(-1, intent);
                FileChooser.this.finish();
            }

            public void d() {
            }
        });
        this.c = getIntent().getStringExtra("StartDir");
        this.d = getIntent().getStringExtra("Extensions");
        this.e = getIntent().getStringExtra("TempDir");
        this.f = getIntent().getStringExtra("SelectDir");
        if (this.c == null) {
            this.c = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else if (this.c.endsWith("/")) {
            this.c = this.c.substring(0, this.c.length() - 1);
        }
        this.g = new Stack<>();
        this.g.push(this.c);
        if (this.d == null) {
            this.d = ".*";
        }
        if (this.e == null) {
            this.e = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        this.a = new File(this.c);
        a(this.a);
        if (this.f == null) {
            ((Button) findViewById(R.id.fileChooserSubmit)).setVisibility(8);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 80);
        this.h.setLayoutParams(layoutParams);
        ((Button) findViewById(R.id.fileChooserSubmit)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str = (String) FileChooser.this.g.peek();
                Toast.makeText(FileChooser.this, FileChooser.this.getString(R.string.fileChooseSelected) + ": " + str, 0).show();
                Intent intent = new Intent();
                intent.putExtra("DirSelected", str);
                FileChooser.this.setResult(-1, intent);
                FileChooser.this.finish();
            }
        });
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.g == null || this.g.size() <= 1) {
            setResult(-1, new Intent());
            finish();
        } else {
            this.g.pop();
            this.a = new File(this.g.peek());
            a(this.a);
        }
        return true;
    }
}
