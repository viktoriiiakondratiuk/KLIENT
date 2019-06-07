package client;

public enum Regular {
    CMD_PING("^%(ping):?"),
    CMD_ECHO("^%(echo):?"),
    CMD_PROCESS("^%(process):?(\\s)((file1)(-)(.)+)(\\s)((file2)(-)(.)+)+;"),
    EXIT("%(exit):?");


    private final String reg;

    Regular(final String reg) {
        this.reg = reg;
    }

    public String getReg() {
        return reg;
    }
}

