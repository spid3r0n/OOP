// écrivez un programme qui effectue des opérations 
// sur des fichiers en utilisant un bloc 'try-catch' 
// et incluez un bloc 'finally' pour fermer le fichier 
// même si une exception se produit

import java.io.*;

public class FileHandler {
        public static void main(String[] args)
    {
        BufferedReader reader = null; //initialize the reader to NULL
        try{
            File myfile = new File("TP6/file.txt"); 
             reader = new BufferedReader(new FileReader(myfile));
             String line = reader.readLine();
             System.out.println("the first line : " + line); 
        }
        catch(FileNotFoundException e)
        {
            System.err.println("file not found  or wrong path ⁽- _ -⁾ ");
        }
        catch(IOException e)
        {
         System.out.println("error while reading the file: " + e.getMessage()); 
            
        }
        finally{
             
            try{
                if (reader != null)
                {
                    reader.close();                   
                    System.out.println("file closed successfully ! "); 
                }
            }
                catch(IOException e)
                {
                    System.err.println("error while closing the file : " + e.getMessage());
                }

                
            }
        }
    }
