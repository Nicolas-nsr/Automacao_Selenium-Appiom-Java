package com.exemplo.tests;
import com.google.errorprone.annotations.FormatString;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class ValidacaoPage {

	public static void main(String[] args) {
		String titulo = ("Googlee") ;{
		
			if (titulo.contains("Google")) {
		    System.out.println("Página correta!");
		    //assertEquals("Google", titulo);
			}else {
		    System.out.println("Página incorreta");
			}
		}
	}}

