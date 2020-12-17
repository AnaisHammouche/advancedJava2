package IHM;

import java.util.ArrayList;

public class bibiotheque {
    private livre[] bib = {};



    public livre[] refresh(ArrayList list){




    return bib;
    }


    public void addBook(livre newlivre){
        int taille = bib.length;
        bib[taille+1] = newlivre;
    }

    
}
