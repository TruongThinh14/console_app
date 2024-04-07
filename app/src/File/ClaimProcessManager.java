package File;

import java.util.List;

interface ClaimProcessManager {
    void add(Claim claim);
    void update(Claim claim);
    void delete(Claim claim);
    Claim getOne(String claimId);
    List<Claim> getAll();
}

// Class to manage claims
class ClaimManager implements ClaimProcessManager {
    private List<Claim> claimList;

    ClaimManager(List<Claim> initialClaims) {
        this.claimList = initialClaims;
    }

    @Override
    public void add(Claim claim) {
        claimList.add(claim);
    }

    @Override
    public void update(Claim claim) {
        // Update logic
    }

    @Override
    public void delete(Claim claim) {
        claimList.remove(claim);
    }

    @Override
    public Claim getOne(String claimId) {
        // Find and return claim by ID
        return null;
    }

    @Override
    public List<Claim> getAll() {
        return claimList;
    }
}
