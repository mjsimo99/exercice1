package interfeces;

import dto.Chef;
import dto.Phase;
import dto.Project;

public interface Ichef {




    Chef Add(Chef chef);
    Chef Update(Chef chef);
    boolean Delete(int code);
    Phase AddPhase(Phase phase);
    Chef UpdatePhase(int code);
    Project UpdateProject(int code);








}
