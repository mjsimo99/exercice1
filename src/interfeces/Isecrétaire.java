package interfeces;

import dto.Client;
import dto.Contact;
import dto.Project;
import dto.Secrétaire;

public interface Isecrétaire {

    Secrétaire Add(Secrétaire secrétaire);
    Secrétaire Update(Secrétaire secrétaire);
    Boolean Delete(int registrationNumber);
    Project Add(Project project);
    Project Update(Project project);
    Contact Add(Contact contact);
    Contact Update(Contact contact);
    Client Add(Client client);
    Client Update(Client client);
    Project[] SearchProjects();


}
