package telemetry.server.bo;

public class MyException extends Exception {
	private static final long serialVersionUID = 15456771565L;

    private String code;
    private String msg;

    public MyException() {}

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}