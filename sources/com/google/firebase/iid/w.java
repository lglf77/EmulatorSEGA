package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.v4.c.f;
import android.util.Log;
import com.google.android.gms.b.e;
import com.google.android.gms.b.g;
import com.google.android.gms.iid.MessengerCompat;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class w {
    private static int a = 0;
    private static PendingIntent b;
    private final f<String, e<Bundle>> c = new f<>();
    private final Context d;
    private final v e;
    private Messenger f;
    private Messenger g;
    private MessengerCompat h;

    public w(Context context, v vVar) {
        this.d = context;
        this.e = vVar;
        this.f = new Messenger(new x(this, Looper.getMainLooper()));
    }

    private static synchronized String a() {
        String num;
        synchronized (w.class) {
            int i = a;
            a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (w.class) {
            if (b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", b);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Message message) {
        String str;
        String str2;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof MessengerCompat) {
                this.h = (MessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.g = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent2.getExtras());
                    Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf).toString());
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf2 = String.valueOf(stringExtra2);
                    Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (!"ID".equals(split[1])) {
                        String valueOf3 = String.valueOf(stringExtra2);
                        Log.w("FirebaseInstanceId", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                    }
                    if (split.length > 2) {
                        str = split[2];
                        str2 = split[3];
                        if (str2.startsWith(":")) {
                            str2 = str2.substring(1);
                        }
                    } else {
                        str2 = "UNKNOWN";
                        str = null;
                    }
                    intent2.putExtra("error", str2);
                } else {
                    str = null;
                    str2 = stringExtra2;
                }
                a(str, str2);
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                synchronized (this.c) {
                    e remove = this.c.remove(group);
                    if (remove == null) {
                        String valueOf4 = String.valueOf(group);
                        Log.w("FirebaseInstanceId", valueOf4.length() != 0 ? "Missing callback for ".concat(valueOf4) : new String("Missing callback for "));
                        return;
                    }
                    remove.a(extras);
                }
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf5 = String.valueOf(stringExtra);
                Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response string: ".concat(valueOf5) : new String("Unexpected response string: "));
            }
        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf6 = String.valueOf(action);
            Log.d("FirebaseInstanceId", valueOf6.length() != 0 ? "Unexpected response action: ".concat(valueOf6) : new String("Unexpected response action: "));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r2 = r5.c
            monitor-enter(r2)
            if (r6 != 0) goto L_0x002a
            r0 = 0
            r1 = r0
        L_0x0007:
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r0 = r5.c     // Catch:{ all -> 0x004b }
            int r0 = r0.size()     // Catch:{ all -> 0x004b }
            if (r1 >= r0) goto L_0x0023
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r0 = r5.c     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.c(r1)     // Catch:{ all -> 0x004b }
            com.google.android.gms.b.e r0 = (com.google.android.gms.b.e) r0     // Catch:{ all -> 0x004b }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x004b }
            r3.<init>(r7)     // Catch:{ all -> 0x004b }
            r0.a((java.lang.Exception) r3)     // Catch:{ all -> 0x004b }
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0007
        L_0x0023:
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r0 = r5.c     // Catch:{ all -> 0x004b }
            r0.clear()     // Catch:{ all -> 0x004b }
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
        L_0x0029:
            return
        L_0x002a:
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r0 = r5.c     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.remove(r6)     // Catch:{ all -> 0x004b }
            com.google.android.gms.b.e r0 = (com.google.android.gms.b.e) r0     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0054
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r3 = "Missing callback for "
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x004b }
            int r4 = r0.length()     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x004e
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x004b }
        L_0x0046:
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            goto L_0x0029
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004e:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x004b }
            r0.<init>(r3)     // Catch:{ all -> 0x004b }
            goto L_0x0046
        L_0x0054:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x004b }
            r1.<init>(r7)     // Catch:{ all -> 0x004b }
            r0.a((java.lang.Exception) r1)     // Catch:{ all -> 0x004b }
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.w.a(java.lang.String, java.lang.String):void");
    }

    private final Bundle b(Bundle bundle) {
        Bundle c2 = c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        Bundle c3 = c(bundle);
        if (c3 == null || !c3.containsKey("google.messenger")) {
            return c3;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private final android.os.Bundle c(android.os.Bundle r10) {
        /*
            r9 = this;
            r8 = 3
            r7 = 2
            java.lang.String r1 = a()
            com.google.android.gms.b.e r0 = new com.google.android.gms.b.e
            r0.<init>()
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r2 = r9.c
            monitor-enter(r2)
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r3 = r9.c     // Catch:{ all -> 0x0024 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            com.google.firebase.iid.v r2 = r9.e
            int r2 = r2.a()
            if (r2 != 0) goto L_0x0027
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "MISSING_INSTANCEID_SERVICE"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r0
        L_0x0027:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.v r3 = r9.e
            int r3 = r3.a()
            if (r3 != r7) goto L_0x00d6
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
        L_0x003e:
            r2.putExtras(r10)
            android.content.Context r3 = r9.d
            a((android.content.Context) r3, (android.content.Intent) r2)
            java.lang.String r3 = "kid"
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r4 = r4 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "|ID|"
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = "|"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.putExtra(r3, r4)
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x00a0
            java.lang.String r3 = "FirebaseInstanceId"
            android.os.Bundle r4 = r2.getExtras()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r3, r4)
        L_0x00a0:
            java.lang.String r3 = "google.messenger"
            android.os.Messenger r4 = r9.f
            r2.putExtra(r3, r4)
            android.os.Messenger r3 = r9.g
            if (r3 != 0) goto L_0x00af
            com.google.android.gms.iid.MessengerCompat r3 = r9.h
            if (r3 == 0) goto L_0x00f3
        L_0x00af:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r4 = r9.g     // Catch:{ RemoteException -> 0x00e3 }
            if (r4 == 0) goto L_0x00dd
            android.os.Messenger r4 = r9.g     // Catch:{ RemoteException -> 0x00e3 }
            r4.send(r3)     // Catch:{ RemoteException -> 0x00e3 }
        L_0x00be:
            com.google.android.gms.b.d r0 = r0.a()     // Catch:{ InterruptedException -> 0x010a, TimeoutException -> 0x013a, ExecutionException -> 0x0125 }
            r2 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x010a, TimeoutException -> 0x013a, ExecutionException -> 0x0125 }
            java.lang.Object r0 = com.google.android.gms.b.g.a(r0, r2, r4)     // Catch:{ InterruptedException -> 0x010a, TimeoutException -> 0x013a, ExecutionException -> 0x0125 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ InterruptedException -> 0x010a, TimeoutException -> 0x013a, ExecutionException -> 0x0125 }
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r2 = r9.c
            monitor-enter(r2)
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r3 = r9.c     // Catch:{ all -> 0x0107 }
            r3.remove(r1)     // Catch:{ all -> 0x0107 }
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            return r0
        L_0x00d6:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
            goto L_0x003e
        L_0x00dd:
            com.google.android.gms.iid.MessengerCompat r4 = r9.h     // Catch:{ RemoteException -> 0x00e3 }
            r4.a(r3)     // Catch:{ RemoteException -> 0x00e3 }
            goto L_0x00be
        L_0x00e3:
            r3 = move-exception
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x00f3
            java.lang.String r3 = "FirebaseInstanceId"
            java.lang.String r4 = "Messenger failed, fallback to startService"
            android.util.Log.d(r3, r4)
        L_0x00f3:
            com.google.firebase.iid.v r3 = r9.e
            int r3 = r3.a()
            if (r3 != r7) goto L_0x0101
            android.content.Context r3 = r9.d
            r3.sendBroadcast(r2)
            goto L_0x00be
        L_0x0101:
            android.content.Context r3 = r9.d
            r3.startService(r2)
            goto L_0x00be
        L_0x0107:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            throw r0
        L_0x010a:
            r0 = move-exception
        L_0x010b:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "No response"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x011a }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011a }
            java.lang.String r2 = "TIMEOUT"
            r0.<init>(r2)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x011a:
            r0 = move-exception
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r2 = r9.c
            monitor-enter(r2)
            android.support.v4.c.f<java.lang.String, com.google.android.gms.b.e<android.os.Bundle>> r3 = r9.c     // Catch:{ all -> 0x0137 }
            r3.remove(r1)     // Catch:{ all -> 0x0137 }
            monitor-exit(r2)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x0125:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x011a }
            boolean r2 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x0131
            java.io.IOException r0 = (java.io.IOException) r0     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x0131:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x011a }
            r2.<init>(r0)     // Catch:{ all -> 0x011a }
            throw r2     // Catch:{ all -> 0x011a }
        L_0x0137:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x013a:
            r0 = move-exception
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.w.c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        if (this.e.d() < 12000000) {
            return b(bundle);
        }
        try {
            return (Bundle) g.a(k.a(this.d).a(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 22).append("Error making request: ").append(valueOf).toString());
            }
            if (!(e2.getCause() instanceof t) || ((t) e2.getCause()).a() != 4) {
                return null;
            }
            return b(bundle);
        }
    }
}
