package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        for (HttpStatus status : values()) {
            if (status.getCode() == httpCodeInput) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return 200 <= this.code && this.code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
