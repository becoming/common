package lu.smarthome.common.constants;

/**
 * Constants for the http status codes
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status">HTTP response status codes</a>
 */
public class HttpConst {

    /**
     * This interim response indicates that everything so far is OK and that the client should continue the request, or ignore the response if the request is already finished.
     * <br/><br/>Informational responses (100–199)
     */
    public static final int CONTINUE_100 = 100;

    /**
     * This code is sent in response to an Upgrade request header from the client, and indicates the protocol the server is switching to.
     * <br/><br/>Informational responses (100–199)
     */
    public static final int SWITCHING_PROTOCOL_101 = 101;

    /**
     * This code indicates that the server has received and is processing the request, but no response is available yet.
     * <br/><br/>Informational responses (100–199)
     * <br/>WebDAV
     */
    public static final int PROCESSING_102 = 102;

    /**
     * This status code is primarily intended to be used with the Link header, letting the user agent start preloading resources while the server prepares a response.
     * <br/><br/>Informational responses (100–199)
     */
    public static final int EARLY_HITS_103 = 103;

    /**
     *     The request has succeeded. The meaning of the success depends on the HTTP method:
     *
     *     <br/><br/><strong>GET</strong>: The resource has been fetched and is transmitted in the message body.
     *     <br/><strong>HEAD</strong>: The entity headers are in the message body.
     *     <br/><strong>PUT or POST</strong>: The resource describing the result of the action is transmitted in the message body.
     *     <br/><strong>TRACE</strong>: The message body contains the request message as received by the server
     *
     * <br/><br/>Successful responses (200–299)
     */
    public static final int OK_200 = 200;

    /**
     * The request has succeeded, and a new resource has been created as a result. This is typically the response sent after <strong>POST</strong> requests, or some <strong>PUT</strong> requests.
     * <br/><br/>Successful responses (200–299)
     */
    public static final int CREATED_201 = 201;

    /**
     * The request has been received but not yet acted upon. It is noncommittal, since there is no way in HTTP to later send an asynchronous response indicating the outcome of the request. It is intended for cases where another process or server handles the request, or for batch processing.
     * <br/><br/>Successful responses (200–299)
     */
    public static final int ACCEPTED_202 = 202;

    /**
     * This response code means the returned meta-information is not exactly the same as is available from the origin server, but is collected from a local or a third-party copy. This is mostly used for mirrors or backups of another resource. Except for that specific case, the "200 OK" response is preferred to this status.
     * <br/><br/>Successful responses (200–299)
     */
    public static final int NON_AUTHORITATIVE_INFORMATION_203 = 203;

    /**
     * There is no content to send for this request, but the headers may be useful. The user-agent may update its cached headers for this resource with the new ones.
     * <br/><br/>Successful responses (200–299)
     */
    public static final int NO_CONTENT_204 = 204;

    /**
     * Tells the user-agent to reset the document which sent this request.
     * <br/><br/>Successful responses (200–299)
     */
    public static final int REST_CONTENT_205 = 205;

    /**
     * This response code is used when the Range header is sent from the client to request only part of a resource.
     * <br/><br/>Successful responses (200–299)
     */
    public static final int PARTIAL_CONTENT_206 = 206;

    /**
     * Conveys information about multiple resources, for situations where multiple status codes might be appropriate.
     * <br/><br/>Successful responses (200–299)
     * <br/>WebDAV
     */
    public static final int MULTI_STATUS_207 = 207;

    /**
     * Used inside a <dav:propstat> response element to avoid repeatedly enumerating the internal members of multiple bindings to the same collection.
     * <br/><br/>Successful responses (200–299)
     * <br/>WebDAV
     */
    public static final int ALREADY_REPORTED_208 = 208;

    /**
     * The server has fulfilled a GET request for the resource, and the response is a representation of the result of one or more instance-manipulations applied to the current instance.
     * <br/><br/>Successful responses (200–299)
     * <br/>HTTP Delta encoding
     */
    public static final int IM_USED_226 = 226;

    /**
     * <br/><br/>Redirects (300–399)
     */

    /**
     * <br/><br/>Client errors (400–499)
     */

    /**
     * <br/><br/>Server errors (500–599)
     */

    public static final int BAD_REQUEST_400 = 400;

}
