package interfeces;
import dto.Client;

public interface Iclient {

    Project Add(Project project);
    Project Update(Project project);
    Boolean Delete(String code);
}
