package junit.monprojet;

public class SommeArgent {
	 private int quantite;
	    private String unite;

	    public SommeArgent(int amount, String currency) {
	        quantite = amount;
	        unite = currency;
	    }

	    public int getQuantite() {
	        return quantite;
	    }
	    @Override
	    public String toString() {
	        return quantite + " " + unite;
	    }
	    public String getUnite() {
	        return unite;
	    }

	    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
	        if (!m.getUnite().equals(this.getUnite())) {
	            throw new UniteDistincteException(this, m);
	        } else {
	            return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
	        }

	    }
	    @Override
	    public boolean equals(Object anObject) {
	        if (this == anObject) {
	            return true; // Si les deux objets pointent vers la même référence
	        }
	        if (anObject == null || getClass() != anObject.getClass()) {
	            return false; // Si l'objet comparé est null ou de classe différente
	        }
	        SommeArgent other = (SommeArgent) anObject; // Cast vers SommeArgent
	        return quantite == other.quantite && unite.equals(other.unite); // Comparaison des propriétés
	    }
	    }

