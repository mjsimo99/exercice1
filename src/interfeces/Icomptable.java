package interfeces;


import dto.Comptable;
import dto.Phase;

public interface Icomptable {

    Comptable Add(Comptable comptable);
    Comptable Update(Comptable comptable);
    Boolean Delete(int registrationNumber);
    Phase UpdatePhaseInvoice(Phase phase);
    Phase FacturePhase(String code);

}
