package IHM;

import java.util.ArrayList;

public class bibliotheque {

    private livre[] bib = {};



    //public livre[] refresh(ArrayList list){




    //return bib;
    //}


    public void addBook(livre newlivre){

        int taille = bib.length;
        livre[] blabla= new livre[taille+1];

        for(int i = 0;i<taille;i++){
            blabla[i] = bib[i];
        }

        blabla[taille] = newlivre;


        bib = blabla;
        System.out.println(bib);
    }

    public void remove(){
        bib = new livre[]{};
    }

    public livre[] getBib() {
        return bib;
    }

    public String[] search2A(){
        String[] a = new String[0];

        for(int b = 0;b<bib.length;b++){
            int taille = a.length;
            String verif = bib[b].getName();
            int index = verif.indexOf("a");
            System.out.println(index);
            if(index == 1){
                String[] f = new String[taille+1];
                for(int c = 0;c<taille;c++){
                    f[c] = a[c];
                }
                f[taille] = verif;
                a = f;
            }

        }

        return a;
    }





}

