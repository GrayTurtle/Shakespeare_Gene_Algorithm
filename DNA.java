class DNA {

    //random phrase
    char[] genes = new char[18];

    //create random phrase
    DNA() {
        for (int i = 0; i < genes.length; i++) {
            genes[i] = (char) random(32,128);
        }
    }
}
