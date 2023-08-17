package practise.daytime.practise08;

public class DiyetEkmek extends MisirEkmek{


    @Override
    void gramaj500() {
        System.out.println("Diyet 100 gr dir");
    }

    //Biz misirekmek'i extend ettik. MisirEkmek, zaten hijyenikOlma() metodunu "override" etmisti.
    // Dolayisi ile bizim "override" etme zorunlulugumuz yok

}
