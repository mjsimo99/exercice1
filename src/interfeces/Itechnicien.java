package interfeces;

import dto.Technicien;

public interface Itechnicien {

    Technicien Add(Technicien technicien);
    Technicien Update(Technicien technicien);
    Boolean Delete(int registrationNumber);
}
