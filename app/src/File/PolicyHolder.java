package File;

import java.util.List;

public class PolicyHolder extends Customer {
    private List<Dependent> dependents;

    public void addDependent(Dependent dependent) {
        dependents.add(dependent);
    }

    public void removeDependent(Dependent dependent) {
        dependents.remove(dependent);
    }

    // Constructor, getters, and setters
}