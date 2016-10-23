

package javaapplication;

/**
 *
 * @author Alicia Sandoval
 */

public class Traductor {    
    private char[] letra={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',' ','0','1','2','3','4','5','6','7','8','9',
        '#','/',',','-','.','!','?','*','(',')','@'};
    private String[] imagen={"a.jpg","b.jpg","c.jpg","d.jpg","e.jpg","f.jpg","g.jpg","h.jpg","i.jpg","j.jpg","k.jpg","l.jpg","m.jpg","n.jpg","ñ.jpg","o.jpg","p.jpg","q.jpg","r.jpg","s.jpg","t.jpg","u.jpg","v.jpg","w.jpg","x.jpg","y.jpg","z.jpg","espacio.jpg","0.jpg","1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.jpg","9.jpg","#.jpg","diagonal.jpg","coma.jpg","-.jpg","..jpg","!.jpg","interrogacion.jpg","asterisco.jpg","(.jpg",").jpg","@.jpg"};
    private char[] textoOriginal=new char[10000];
    private String[] traduccion=new String[10000];
    
    public Traductor(char[] textoOriginal) {
        this.textoOriginal = textoOriginal;
    }
    
    public char[] getLetra() {
        return letra;
    }

    public void setLetra(char[] letra) {
        this.letra = letra;
    }

    public String[] getImagen() {
        return imagen;
    }

    public void setImagen(String[] imagen) {
        this.imagen = imagen;
    }

    public char[] gettextoOriginal() {
        return textoOriginal;
    }

    public void settextoOriginal(char[] textoOriginal) {
        this.textoOriginal = textoOriginal;
    }

    public String[] getTraduccion() {
        String palabras[]=new String[10000];
        int contador=0;
        char txtC[]=new char[10000];
        txtC=gettextoOriginal();
        for (int i = 0; i < txtC.length; i++) {
            for(int j=0; j< letra.length;j++){
                String c= ""+txtC[i];
                if(txtC[i]==letra[j] && c!=null && c!=""){
                        palabras[contador]=imagen[j];   
                        contador++;
                }
            }
        }
        return palabras;
    }

    public void setTraduccion(String[] traduccion) {
        this.traduccion = traduccion;
    }

    
}
