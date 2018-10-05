
package udvozlet;

/**
 *
 * @author t1
 */
public class Ember {
    private String nev;

    public Ember(String nev) {
        this.nev = nev;
    }
    
    public String koszont(){
        return "Üdvözöllek "+ nev +"!";
    }
}
