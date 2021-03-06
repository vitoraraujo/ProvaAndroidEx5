package com.example.lab109.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class MainActivity extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "banco.db";
    private static final String TABELA = "contatos";
    private static final String ID = "_id";
    private static final String NOME = "nome";
    private static final String TELEFONE = "telefone";
    private static final String EMAIL = "email";
    private static final int VERSAO = 1;

    public MainActivity(Context context){
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"("
                + ID + "integer primary key autoincrement,"
                + NOME + "text,"
                + TELEFONE + "text,"
                + EMAIL + "text"
                +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
