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

    }

    public void remove(int nbRow){
        livre[] dd;
        if(bib.length == 0){
            dd = new livre[0];
        }else{
            dd = new livre[bib.length-1];
        }
        int compteur = 0;
        int curseur = 0;
        while (compteur != bib.length){
            if(compteur != nbRow){
                dd[curseur] = bib[compteur];
                curseur++;
            }
            compteur++;

        }






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

