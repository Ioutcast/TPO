package vasilkov.model;


import lombok.Data;


@Data
public class Story {
    private Artur artur ;
    private Crowd crowd ;
    private Speaker speaker ;
    private Construction construction ;
    private boolean isSceneSet = false;

    public void initScene() {
        crowd = new Crowd();
        artur = new Artur("Artur",9,13);
        speaker = new Speaker( "Speaker");
        construction= new Construction();
        isSceneSet = true;
    }

}
