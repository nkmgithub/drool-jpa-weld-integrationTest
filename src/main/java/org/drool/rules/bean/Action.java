package org.drool.rules.bean;


public class Action {
    private String name;
    private String version;
    private String previousAction;
    private String currentAction;

    public Action(String name, String version, String previousAction, String currentAction) {
        this.name = name;
        this.version = version;
        this.previousAction = previousAction;
        this.currentAction = currentAction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPreviousAction() {
        return previousAction;
    }

    public void setPreviousAction(String previousAction) {
        this.previousAction = previousAction;
    }

    public String getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(String currentAction) {
        this.currentAction = currentAction;
    }

    @Override
    public String toString() {
        return "Action{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", previousAction='" + previousAction + '\'' +
                ", currentAction='" + currentAction + '\'' +
                '}';
    }
}
