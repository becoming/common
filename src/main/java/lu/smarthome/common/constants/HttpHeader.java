package lu.smarthome.common.constants;

import lombok.experimental.UtilityClass;

/**
 * Headers can be grouped according to their contexts:
 * <p>
 * <br/><strong>General headers</strong> apply to both requests and responses, but with no relation to the data transmitted in the body.
 * <br/><strong>Request headers</strong> contain more information about the resource to be fetched, or about the client requesting the resource.
 * <br/><strong>Response headers</strong> hold additional information about the response, like its location or about the server providing it.
 * <br/><strong>Entity headers</strong> contain information about the body of the resource, like its content length or MIME type.
 * <p>
 * Other groupings are available.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers">HTTP headers</a>
 */
@SuppressWarnings("ALL")
@UtilityClass
public class HttpHeader {

    /**
     * Authentication
     * <br/>Response header
     * <br/><br/>
     * Defines the authentication method that should be used to access a resource.
     * <pre>{@code
     * WWW-Authenticate: <type> realm=<realm>
     * }</pre>
     */
    public final String WWW_AUTHENTICATE = "WWW-Authenticate";

    /**
     * Authentication
     * <br/>Request header
     * <br/><br/>
     * Contains the credentials to authenticate a user-agent with a server.
     * <pre>{@code
     *  Authorization: <type> <credentials>
     * }</pre>
     * <p>
     */
    public final String AUTHORIZATION = "Authorization";

    /**
     * Authentication
     * <br/>Response header
     * <br/><br/>
     * Defines the authentication method that should be used to access a resource behind a proxy server.
     * <pre>{@code
     * Proxy-Authenticate: <type> realm=<realm>
     * }</pre>
     */
    public final String PROXY_AUTHENTICATE = "Proxy-Authenticate";

    /**
     * Authentication
     * <br/>Request header
     * <br/><br/>
     * Contains the credentials to authenticate a user agent with a proxy server.
     * <pre>{@code
     * Proxy-Authorization: <type> <credentials>
     * }</pre>
     */
    public final String PROXY_AUTHORIZATION = "Proxy-Authorization";

    /**
     * Caching
     * <br/>Response header
     * <br/><br/>
     * The time, in seconds, that the object has been in a proxy cache.
     * <pre>{@code
     * Age: <delta-seconds>
     * }</pre>
     */
    public final String AGE = "Age";

    /**
     * Caching
     * <br/>General header
     * <br/><br/>
     * Directives for caching mechanisms in both requests and responses.
     * <pre>{@code
     * Cache-Control: max-age=<seconds>
     * Cache-Control: max-stale[=<seconds>]
     * Cache-Control: min-fresh=<seconds>
     * Cache-Control: no-cache
     * Cache-Control: no-store
     * Cache-Control: no-transform
     * Cache-Control: only-if-cached
     * }</pre>
     */
    public final String CACHE_CONTROL = "Cache-Control";

    /**
     * Caching
     * <br/>Response header
     * <br/><br/>
     * Clears browsing data (e.g. cookies, storage, cache) associated with the requesting website.
     * <pre>{@code
     * // Single directive
     * Clear-Site-Data: "cache"
     *
     * // Multiple directives (comma separated)
     * Clear-Site-Data: "cache", "cookies", "storage", "executionContexts"
     *
     * // Wild card
     * Clear-Site-Data: "*"
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Clear-Site-Data#Directives">Directives</a>
     */
    public final String CLEAR_SITE_DATA = "Clear-Site-Data";

    /**
     * Caching
     * <br/>Response header
     * <br/><br/>
     * The date/time after which the response is considered stale.
     * <pre>{@code
     * Expires: <http-date>
     * }</pre>
     */
    public final String EXPIRES = "Expires";

    /**
     * Caching
     * <br/>General header
     * <br/><br/>
     * Implementation-specific header that may have various effects anywhere along the request-response chain. Used for backwards compatibility with HTTP/1.0 caches where the Cache-Control header is not yet present.
     * <br/>
     * <br/>
     * <strong>Note</strong>: Pragma is not specified for HTTP responses and is therefore not a reliable replacement for the general HTTP/1.1 Cache-Control header, although it does behave the same as Cache-Control: no-cache, if the Cache-Control header field is omitted in a request. Use Pragma only for backwards compatibility with HTTP/1.0 clients.
     * <pre>{@code
     * Pragma: no-cache
     * }</pre>
     */
    public final String PRAGMA = "Pragma";

    /**
     * Caching
     * <br/>General header
     * <br/><br/>
     * General warning information about possible problems.
     * <pre>{@code
     * Warning: <warn-code> <warn-agent> <warn-text> [<warn-date>]
     * Example:
     * Warning: 110 anderson/1.3.37 "Response is stale"
     * Warning: 112 - "cache down" "Wed, 21 Oct 2015 07:28:00 GMT"
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Warning#Directives">Directives</a>
     */
    public final String WARNING = "Warning";

    /**
     * Client hints
     * <br/>Response header
     * <br/>HTML5
     * <br/><br/>
     * Servers can advertise support for Client Hints using the Accept-CH header field or an equivalent HTML <meta> element with http-equiv attribute
     * <pre>{@code
     * Accept-CH: <list of client hints>
     *
     * Examples
     * Accept-CH: DPR, Viewport-Width
     * Accept-CH: Width
     * Accept-CH-Lifetime: 86400
     * Vary: DPR, Viewport-Width, Width
     * }</pre>
     */
    public final String ACCEPT_CH = "Accept-CH";

    /**
     * Client hints
     * <br/>Response header
     * <br/><br/>
     * Servers can ask the client to remember the set of Client Hints that the server supports for a specified period of time, to enable delivery of Client Hints on subsequent requests to the server’s origin (RFC6454).
     * <pre>{@code
     * Accept-CH-Lifetime: <age>
     *
     * Examples
     * Accept-CH: Viewport-Width, DPR
     * Accept-CH-Lifetime: 86400
     * }</pre>
     */
    public final String ACCEPT_CH_LIFETIME = "Accept-CH-Lifetime";

    /**
     * Client hints
     * <br/>Request header
     * <br/><br/>
     * Indicates that the request has been conveyed in early data.
     * <pre>{@code
     * Early-Data: 1
     * }</pre>
     */
    public final String EARLY_DATA = "Early-Data";

    /**
     * Client hints
     * <br/><br/>
     * A number that indicates the ratio between physical pixels over CSS pixels of the selected image response.
     */
    public final String CONTENT_DPR = "Content-DPR";

    /**
     * Client hints
     * <br/>Request header
     * <br/><br/>
     * A number that indicates the client’s current Device Pixel Ratio (DPR), which is the ratio of physical pixels over CSS pixels (Section 5.2 of [CSSVAL]) of the layout viewport (Section 9.1.1 of [CSS2]) on the device.
     * <pre>{@code
     * DPR: <number>
     *
     * Examples
     * Server first needs to opt in to receive DPR header by sending the response headers Accept-CH containing DPR and Accept-CH-Lifetime.
     *
     * Accept-CH: DPR
     * Accept-CH-Lifetime: 86400
     *
     * Then on subsequent requests the client might send DPR header back:
     *
     * DPR: 1.0
     * }</pre>
     */
    public final String DPR = "DPR";
}
