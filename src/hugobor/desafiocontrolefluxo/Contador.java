/*
   Copyright 2024 Hugo Borges de Carvalho

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

// Adicionei licença por meme. HAHAHAHAH!
   
package hugobor.desafiocontrolefluxo;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Faz coisas.
 */
public class Contador {
    
    public static void main(String[] args) {
	
	var out = System.out;
	var err = System.err;
	
	int start =0;
	int end = 0;
	
	// Loop para garantir a leitura correta
	boolean readingSuccefull = false;
	do {
        	try (var reader = new Scanner(System.in)) {
        	    reader.useLocale(Locale.of("en", "US"));
        	    	
        	    out.print("Digite o primeiro parâmetro: ");
        	    start = reader.nextInt();
        	    
        	    out.print("Digite o segundo parâmetro: ");
        	    end = reader.nextInt();
        	    
        	    readingSuccefull = true;
        	} catch (Exception ignore) {
        	    err.println("Digite os valores corretamente por favor…");
        	    readingSuccefull = false;
        	}
	} while (!readingSuccefull);
	
	try {
	    count(start, end);
	} catch (InvalidParameters ignore) {
	    err.println("O segundo parâmetro deve ser maior que o primeiro.");
	}
    }

    
    static void count(int start, int end) throws InvalidParameters {
	if (start > end) {
	    throw new InvalidParameters();
	}
	
	
	var out = System.out;
	
	var iterations = end - start;
	for (int i = 0; i <= iterations; i++) {
	    out.format("Imprimindo número %d: %d%n", i+1, start);
	    start++;
	}
    }
    
}



















