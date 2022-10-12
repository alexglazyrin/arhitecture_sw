package ru.gb;

public class ModelStore {
    PoligonalModel models;
    Scene scenes;
    Flash Flashes;
    Camera Cameras;
    private IModelChangedObserve changeObserver;

    public Scene GetScena (int x){
        Scene sc = new Scene();
        return sc;
    }

    public void NotifyChange(IModelChanger imc){

    }
}
