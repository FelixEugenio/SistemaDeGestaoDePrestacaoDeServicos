/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Utilitarios;
import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class ValidandoCampoNumerico extends  PlainDocument{
    
    
    public void InserirString(int offs ,String str, AttributeSet a) throws BadLocationException{
        if (str == null) {
            return;
        }
        // Substitui todos os caracteres que não são números por uma string vazia
        String numericStr = str.replaceAll("[^0-9]", "");
        super.insertString(offs, numericStr, a);
    }
    
}
