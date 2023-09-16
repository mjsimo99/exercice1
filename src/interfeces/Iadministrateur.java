package interfeces;

import dto.Admistrateur;
import dto.Employer;

public interface Iadministrateur {


    Admistrateur Add(Admistrateur admistrateur);
    Admistrateur Update(Admistrateur admistrateur);
    Boolean Delete(int registrationNumber);
    Employer AddEmployee(Employer employer);
    Employer UpdateEmployee(Employer employer);
    Boolean DeleteEmployee(int registrationNumber);
}
