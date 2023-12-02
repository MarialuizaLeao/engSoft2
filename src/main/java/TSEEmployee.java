 

public class TSEEmployee{

  protected final String user;
  protected final String password;

  public TSEEmployee(String user, String password) {
    this.user = user;
    this.password = password;
  }

  public void startSession(Election election, String password) {
    election.start(password);
  }

  public void endSession(Election election, String password) {
    election.finish(password);
  }

  public String getFinalResult(Election election, String password) {
    return election.getResults(password);
  }

  public void addCandidate(Candidate candidate, Election election, String password) {
    if (candidate instanceof President)
      election.addPresidentCandidate((President) candidate, password);
    else if (candidate instanceof FederalDeputy)
      election.addFederalDeputyCandidate((FederalDeputy) candidate, password);
    else if (candidate instanceof Governor)
      election.addGovernorCandidate((Governor) candidate, password);
  }

  public void removeCandidate(Candidate candidate, Election election, String password) {
    if (candidate instanceof President)
      election.removePresidentCandidate((President) candidate, password);
    else if (candidate instanceof FederalDeputy)
      election.removeFederalDeputyCandidate((FederalDeputy) candidate, password);
    else if (candidate instanceof Governor)
      election.removeGovernorCandidate((Governor) candidate, password);
  }

  public static class Builder {
    protected String user;
    protected String password;

    public Builder user(String user) {
      this.user = user;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public TSEEmployee build() {
      if (user == null)
        throw new IllegalArgumentException("user mustn't be null");

      if (user.isEmpty())
        throw new IllegalArgumentException("user mustn't be empty");

      if (password == null)
        throw new IllegalArgumentException("password mustn't be null");

      if (password.isEmpty())
        throw new IllegalArgumentException("password mustn't be empty");

      return new TSEEmployee(
          this.user,
          this.password);
    }
  }

  public String getUser() {
    return this.user;
  }
}
