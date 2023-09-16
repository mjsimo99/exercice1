package interfeces;

import dto.Directeur;
import dto.Project;

public interface Idirecteur {


    Directeur Add(Directeur directeur);
    Directeur Update(Directeur directeur);
    Boolean Delete(int registrationNumber);
    Project Update(Project project);
    Project[] SearchProjects();
}
