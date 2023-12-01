package main.java;
public class Main {
    private static Election uniqueInstance;

    public synchronized static Election getInstance(Election e) {
        if (uniqueInstance == null) {
                uniqueInstance = e;
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {

        Urna urna = new Urna();
        String electionPassword = "password";

        Election currentElection = new Election.Builder()
                .urna(urna)
                .password(electionPassword)
                .build();

        Election uniqueElectionInstance = Main.getInstance(currentElection);

        urna.eleicao = uniqueElectionInstance;
        uniqueElectionInstance.urna = new Urna();

        President presidentCandidate1 = new President("João", "PDS1", 123);
        uniqueElectionInstance.addPresidentCandidate(presidentCandidate1, electionPassword);
        President presidentCandidate2 = new President("Maria", "ED", 124);
        uniqueElectionInstance.addPresidentCandidate(presidentCandidate2, electionPassword);

        UrnaEstadual urnaMG = new UrnaEstadual();
        UrnaEstadual urnaSP = new UrnaEstadual();
        UrnaEstadual urnaRJ = new UrnaEstadual();
        UrnaEstadual urnaES = new UrnaEstadual();

        urnaMG.estado = "MG";
        urnaMG.eleicao = uniqueElectionInstance;
        urnaSP.eleicao = uniqueElectionInstance;
        urnaRJ.eleicao = uniqueElectionInstance;
        urnaES.eleicao = uniqueElectionInstance;

        FederalDeputy federalDeputyCandidate1 = new FederalDeputy("Michael", "PDS1", 12345, "MG");
        urnaMG.federalDeputyCandidates.put(12345, federalDeputyCandidate1);
        FederalDeputy federalDeputyCandidate2 = new FederalDeputy("Cleber", "PDS2", 54321, "MG");
        urnaMG.federalDeputyCandidates.put(54321, federalDeputyCandidate2);
        FederalDeputy federalDeputyCandidate3 = new FederalDeputy("Sofia", "IHC", 11211, "SP");
        urnaSP.federalDeputyCandidates.put(11211, federalDeputyCandidate3);

        Governor governorCadidate1 = new Governor("Marcos", "PDS1", 123456, "MG");
        urnaMG.governorCandidates.put(123456, governorCadidate1);
        Governor governorCadidate2 = new Governor("Marcelo", "PDS2", 654321, "MG");
        urnaMG.governorCandidates.put(654321, governorCadidate2);
        Governor governorCadidate3 = new Governor("Matheus", "PDS3", 123456, "ES");
        urnaES.governorCandidates.put(123546, governorCadidate3);

        Senate senateCandidate1 = new Senate("Sarah", "PDS1", 1234567, "ES");
        urnaES.senateCandidates.put(1234567, senateCandidate1);
        Senate senateCandidate2 = new Senate("Maria", "PDS2", 7654321, "MG");
        urnaMG.senateCandidates.put(7654321, senateCandidate2);
        Senate senateCandidate3 = new Senate("Samantha", "IHC", 1121177, "BA");
        urnaES.senateCandidates.put(1121177, senateCandidate3);

        Mayor mayorCadidate1 = new Mayor("Marcos", "PDS1", 123354456, "MG", "bh");
        urnaMG.mayorCandidates.put(123354456, mayorCadidate1);
        Mayor mayorCadidate2 = new Mayor("Marcelo", "PDS2", 653454321, "MG", "bh");
        urnaMG.mayorCandidates.put(653454321, mayorCadidate2);
        Mayor mayorCadidate3 = new Mayor("Matheus", "PDS3", 123345546, "MG", "bh");
        urnaMG.mayorCandidates.put(123345546, mayorCadidate3);

        uniqueElectionInstance.urna.UrnasMap.put("MG", urnaMG);
        uniqueElectionInstance.urna.UrnasMap.put("SP", urnaSP);
        uniqueElectionInstance.urna.UrnasMap.put("RJ", urnaRJ);
        uniqueElectionInstance.urna.UrnasMap.put("ES", urnaES);

        urna.UrnasMap.put("MG", urnaMG);
        urna.UrnasMap.put("SP", urnaSP);
        urna.UrnasMap.put("RJ", urnaRJ);
        urna.UrnasMap.put("ES", urnaES);
        urna.eleicao = uniqueElectionInstance;
        urnaMG.eleicao = uniqueElectionInstance;
        urnaSP.eleicao = uniqueElectionInstance;
        urnaRJ.eleicao = uniqueElectionInstance;
        urnaES.eleicao = uniqueElectionInstance;

        uniqueElectionInstance.urna.loadVoters();
        uniqueElectionInstance.urna.loadTSEEmployees();
        uniqueElectionInstance.urna.startMenu();
    }
}