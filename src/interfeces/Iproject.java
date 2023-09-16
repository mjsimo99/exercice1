package interfeces;
import dto.Project;
public interface Iproject {


    Project Add(Project project);
    Project Update(Project project);
    Boolean Delete(String code);
}
