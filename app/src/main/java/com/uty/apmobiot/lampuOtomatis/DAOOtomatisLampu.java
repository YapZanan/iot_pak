package com.uty.apmobiot.lampuOtomatis;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOOtomatisLampu {
    private DatabaseReference databaseReference;
    public DAOOtomatisLampu(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(OtomatisLampu.class.getSimpleName());
    }
    public Task<Void> add(OtomatisLampu Otomatis){
        return databaseReference.child("/").setValue(Otomatis);
    }
}