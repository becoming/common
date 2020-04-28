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
     * <br/><br/>
     * Defines the authentication method that should be used to access a resource.
     * <pre>{@code
     * WWW-Authenticate: <type> realm=<realm>
     * }</pre>
     */
    public final String WWW_AUTHENTICATE = "WWW-Authenticate";

    /**
     * Authentication
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
     * <br/><br/>
     * Defines the authentication method that should be used to access a resource behind a proxy server.
     * <pre>{@code
     * Proxy-Authenticate: <type> realm=<realm>
     * }</pre>
     */
    public final String PROXY_AUTHENTICATE = "Proxy-Authenticate";

    /**
     * Authentication
     * <br/><br/>
     * Contains the credentials to authenticate a user agent with a proxy server.
     * <pre>{@code
     * Proxy-Authorization: <type> <credentials>
     * }</pre>
     */
    public final String PROXY_AUTHORIZATION = "Proxy-Authorization";

    /**
     * Caching
     * <br/><br/>
     * The time, in seconds, that the object has been in a proxy cache.
     * <pre>{@code
     * Age: <delta-seconds>
     * }</pre>
     */
    public final String AGE = "Age";

    /**
     * Caching
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
     * <br/><br/>
     * The date/time after which the response is considered stale.
     * <pre>{@code
     * Expires: <http-date>
     * }</pre>
     */
    public final String EXPIRES = "Expires";

    /**
     * Caching
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
}
