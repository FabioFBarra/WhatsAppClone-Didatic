package br.com.whatsappandroid.cursoandroid.whatsapp.helper;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class Preferencias {

    private Context contexto;
    private SharedPreferences preferences;
    private String NOME_ARQUIVO = "whatsapp.preferencias";
    private int MODE = 0;
    private SharedPreferences.Editor editor;
    private final String CHAVE_IDENTIFICADOR = "identificadorUsuarioLogado";
    private final String CHAVE_NOME = "nomeUsuario";
//    private String CHAVE_TELEFONE = "telefone";
//    private String CHAVE_TOKEN = "token";


    public Preferencias(Context contextoParametro){
        contexto = contextoParametro;
        preferences = contexto.getSharedPreferences(NOME_ARQUIVO, MODE);
        editor = preferences.edit();
    }

    public void salvarUsuarioPreferencias (String identificadorUsuario, String nomeDoUsuario){
        editor.putString(CHAVE_IDENTIFICADOR, identificadorUsuario);
        editor.putString(CHAVE_NOME, nomeDoUsuario);
//        editor.putString(CHAVE_TELEFONE, telefone);
//        editor.putString(CHAVE_TOKEN, token);
        editor.commit();
    }
//
//    public HashMap<String, String> getDadosUsuario(){
//        HashMap<String, String> dadosUsuario = new HashMap<>();
//        dadosUsuario.put(CHAVE_NOME, preferences.getString(CHAVE_NOME, null));
//        dadosUsuario.put(CHAVE_TELEFONE, preferences.getString(CHAVE_TELEFONE, null));
//        dadosUsuario.put(CHAVE_TOKEN, preferences.getString(CHAVE_TOKEN, null));
//
//        return dadosUsuario;
//    }

    public String getIdentificador(){
        return preferences.getString(CHAVE_IDENTIFICADOR, null);
    }
    public String getNome(){
        return preferences.getString(CHAVE_NOME, null);
    }
}
