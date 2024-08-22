public class Partida {
    private List<String> palabras;

    
    public Partida() {
        palabras = new ArrayList<>();
        // Puedes agregar aquí las palabras que quieras
        palabras.add("messi");
        palabras.add("copa");
        palabras.add("america");
        palabras.add("argentina");
        palabras.add("mundial");
        palabras.add("qatar");
        palabras.add("bicampeon");
        palabras.add("depaul");
        palabras.add("uruguay");
        palabras.add("seleccion");
    }

    
    public List<String> getPalabras() {
        return palabras;
    }
    
    public boolean letraEnPalabra(String palabra, char letra) {
        return palabra.indexOf(letra) != -1;
    }

}
