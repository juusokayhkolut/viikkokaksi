package main;

class Hedgehog {
    private String nimi;
    private int ika;

    public Hedgehog() {
        this.nimi = "Pikseli";
        this.ika = 5;
    }

    public Hedgehog(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public void puhu(String text) {
        if (text == "") {
        System.out.println("olen " + this.nimi + "ja ikäni on " + this.ika + " vuotta, mutta antaisitko silti syötteen?");
        }
        System.out.println(this.nimi + ": " + text);
    }

    public void run(int kierrokset) {
        for (int i = 0; i < kierrokset; i++) {
            System.out.println(this.nimi + " juoksee kovaa vauhtia!");
        }
    }
}