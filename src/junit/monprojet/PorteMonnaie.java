package junit.monprojet;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.HashMap;

public class PorteMonnaie {
	
	    private HashMap<String, Integer> contenu;

	    public HashMap<String, Integer> getContenu() {
	        return contenu;
	    }

	    public PorteMonnaie() {
	        contenu = new HashMap<String, Integer>();
	    }

	    public void ajouteSomme(SommeArgent sa) {
	        String unite = sa.getUnite();
	        int quantite = sa.getQuantite();
	        
	        if (contenu.containsKey(unite)) {
	            contenu.put(unite, contenu.get(unite) + quantite);
	        } else {
	            contenu.put(unite, quantite);
	        }
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        PorteMonnaie other = (PorteMonnaie) obj;
	        return contenu.equals(other.contenu);
	    }

	    @Override
	    public String toString() {
	        StringBuilder contenuStr = new StringBuilder
	        		("Contenu du porte-monnaie:\n");
	        for (Entry<String, Integer> entry : contenu.entrySet()) {
	            contenuStr.append(entry.getValue()).append(" ").append(entry.getKey()).append("\n");
	        }
	        return contenuStr.toString();
	    }

}
