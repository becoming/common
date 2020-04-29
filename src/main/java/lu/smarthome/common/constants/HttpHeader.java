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

    /**
     * Client hints
     * <br/>Request header
     * <br/><br/>
     * Technically a part of Device Memory API, this header represents an approximate amount of RAM client has.
     * <pre>{@code
     * Device-Memory: <number>
     *
     * Examples
     *
     * Server first needs to opt in to receive Device-Memory header by sending the response headers Accept-CH containing Device-Memory and Accept-CH-Lifetime.
     *
     * Accept-CH: Device-Memory
     * Accept-CH-Lifetime: 86400
     *
     * Then on subsequent requests the client might send Device-Memory header back:
     *
     * Device-Memory: 1
     * }</pre>
     */
    public final String DEVICE_MEMORY = "Device-Memory";

    /**
     * Client hints
     * <br/><br/>
     * A boolean that indicates the user agent's preference for reduced data usage.
     * <pre>{@code
     * Save-Data: <sd-token>
     *
     * <sd-token> A numerical value indicating whether the client wants to opt in to reduced data usage mode. "on" indicates yes, while "off" (the default) indicates no.
     * }</pre>
     */
    public final String SAVE_DATA = "Save-Data";

    /**
     * Client hints
     * <br/><br/>
     * A number that indicates the layout viewport width in CSS pixels. The provided pixel value is a number rounded to the smallest following integer (i.e. ceiling value).
     * <br/>
     * <br/>
     * If Viewport-Width occurs in a message more than once, the last value overrides all previous occurrences.
     */
    public final String VIEWPORT_WIDTH = "Viewport-Width";

    /**
     * Client hints
     * <br/><br/>
     * The Width request header field is a number that indicates the desired resource width in physical pixels (i.e. intrinsic size of an image). The provided pixel value is a number rounded to the smallest following integer (i.e. ceiling value).
     * <br/><br/>
     * If the desired resource width is not known at the time of the request or the resource does not have a display width, the Width header field can be omitted. If Width occurs in a message more than once, the last value overrides all previous occurrences
     */
    public final String WIDTH = "Width";

    /**
     * Conditionals
     * <br/>Response header
     * <br/><br/>
     * The last modification date of the resource, used to compare several versions of the same resource. It is less accurate than ETag, but easier to calculate in some environments. Conditional requests using If-Modified-Since and If-Unmodified-Since use this value to change the behavior of the request.
     * <pre>{@code
     * Last-Modified: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     *
     * <month> One of "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" (case sensitive).
     *
     * Examples
     *
     * Last-Modified: Wed, 21 Oct 2015 07:28:00 GMT
     * Last-Modified: Wed, 04 Jan 2015 07:28:00 GMT
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Last-Modified#Directives">Directives</a>
     */
    public final String LAST_MODIFIED = "Last-Modified";

    /**
     * Conditionals
     * <br/>Response header
     * <br/><br/>
     * A unique string identifying the version of the resource. Conditional requests using If-Match and If-None-Match use this value to change the behavior of the request.
     * <pre>{@code
     * ETag: W/"<etag_value>"
     * ETag: "<etag_value>"
     *
     * Examples
     *
     * ETag: "33a64df551425fcc55e4d42a148795d9f25f89d4"
     * ETag: W/"0815"
     * }</pre>
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag#Directives">Directives</a>
     */
    public final String ETAG = "ETag";

    /**
     * Conditionals
     * <br/>Request header
     * <br/><br/>
     * Makes the request conditional, and applies the method only if the stored resource matches one of the given ETags.
     * <pre>{@code
     * If-Match: <etag_value>
     * If-Match: <etag_value>, <etag_value>, …
     *
     * <etag_value> Entity tags uniquely representing the requested
     * resources. They are a string of ASCII characters placed
     * between double quotes (like "675af34563dc-tr34").
     * They may be prefixed by W/ to indicate that they are "weak",
     * i.e. that they represent the resource semantically,
     * but not byte-for-byte. However, in an If-Match header,
     * weak entity tags will never match.
     *
     * Examples
     *
     * If-Match: "bfc13a64729c4290ef5b2c2730249c88ca92d82d"
     * If-Match: "67ab43", "54ed21", "7892dd"
     * If-Match: *
     * }</pre>
     */
    public final String IF_MATCH = "If-Match";

    /**
     * Conditionals
     * <br/>Request header
     * <br/><br/>
     * Makes the request conditional, and applies the method only if the stored resource doesn't match any of the given ETags. This is used to update caches (for safe requests), or to prevent to upload a new resource when one already exists.
     * <pre>{@code
     * If-None-Match: "<etag_value>"
     * If-None-Match: "<etag_value>", "<etag_value>", …
     * If-None-Match: *
     *
     * Examples
     *
     * If-None-Match: "bfc13a64729c4290ef5b2c2730249c88ca92d82d"
     * If-None-Match: W/"67ab43", "54ed21", "7892dd"
     * If-None-Match: *
     * }</pre>
     */
    public final String IF_NONE_MATCH = "If-None-Match";

    /**
     * Conditionals
     * <br/>Request header
     * <br/><br/>
     * Makes the request conditional, and expects the entity to be transmitted only if it has been modified after the given date. This is used to transmit data only when the cache is out of date.
     * <pre>{@code
     * If-Modified-Since: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     *
     * Examples
     *
     * If-Modified-Since: Wed, 21 Oct 2015 07:28:00 GMT
     *
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Modified-Since#Directives">Directives</a>
     */
    public final String IF_MODIFIED_SINCE = "If-Modified-Since";

    /**
     * Conditionals
     * <br/>Request header
     * <br/><br/>
     * Makes the request conditional, and expects the entity to be transmitted only if it has not been modified after the given date. This ensures the coherence of a new fragment of a specific range with previous ones, or to implement an optimistic concurrency control system when modifying existing documents.
     * <pre>{@code
     * If-Unmodified-Since: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     *
     * Examples
     *
     * If-Unmodified-Since: Wed, 21 Oct 2015 07:28:00 GMT
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Unmodified-Since#Directives">Directives</a>
     */
    public final String IF_UNMODIFIED_SINCE = "If-Unmodified-Since";

    /**
     * Conditionals
     * <br/>Response header
     * <br/><br/>
     * Determines how to match request headers to decide whether a cached response can be used rather than requesting a fresh one from the origin server.
     * <pre>{@code
     * Vary: *
     * Vary: <header-name>, <header-name>, ...
     *
     * Examples
     * Dynamic serving
     *
     * When using the Vary: User-Agent header, caching servers should
     * consider the user agent when deciding whether to serve the page
     * from cache. For example, if you are serving different content
     * to mobile users, it can help you to avoid that a cache may
     * mistakenly serve a desktop version of your site to
     * your mobile users. It can help Google and other
     * search engines to discover the mobile version of a page,
     * and might also tell them that no Cloaking is intended.
     *
     * Vary: User-Agent
     * }</pre>
     */
    public final String VARY = "Vary";

    /**
     * Connection management
     * <br/>General header
     * <br/><br/>
     * Controls whether the network connection stays open after the current transaction finishes.
     * <pre>{@code
     * Connection: keep-alive
     * Connection: close
     * }</pre>
     */
    public final String CONNECTION = "Connection";

    /**
     * Connection management
     * <br/>General header
     * <br/><br/>
     * Controls how long a persistent connection should stay open.
     * <pre>{@code
     * Keep-Alive: parameters
     *
     * Examples
     *
     * A response containing a Keep-Alive header:
     *
     * HTTP/1.1 200 OK
     * Connection: Keep-Alive
     * Content-Encoding: gzip
     * Content-Type: text/html; charset=utf-8
     * Date: Thu, 11 Aug 2016 15:23:13 GMT
     * Keep-Alive: timeout=5, max=1000
     * Last-Modified: Mon, 25 Jul 2016 04:32:39 GMT
     * Server: Apache
     *
     * (body)
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Keep-Alive#Directives">Directives</a>
     */
    public final String KEEP_ALIVE = "Keep-Alive";

    /**
     * Content negotiation
     * <br/>Request header
     * <br/><br/>
     * Informs the server about the types of data that can be sent back.
     * <pre>{@code
     * Accept: <MIME_type>/<MIME_subtype>
     * Accept: <MIME_type>/*
     * Accept: * / *
     * --> no spaces between wildcard and slash
     *
     * // Multiple types, weighted with the quality value syntax:
     * Accept:text/html,application/xhtml+xml,application/xml;q=0.9,image/webp, * / *;q=0.8
     *
     * Examples
     *
     * Accept: text/html
     *
     * Accept: image/*
     *
     * // General default
     * Accept: * / *
     * --> no spaces between wildcard and slash
     *
     * // Default for navigation requests
     * Accept:text/html,application/xhtml+xml,application/xml;q=0.9,* / *;q=0.8
     * }</pre>
     */
    public final String Accept = "Accept";

    /**
     * Content negotiation
     * <br/>Request header
     * <br/><br/>
     * Which character encodings the client understands.
     * <pre>{@code
     * Accept-Charset: <charset>
     *
     * // Multiple types, weighted with the quality value syntax:
     * Accept-Charset: utf-8, iso-8859-1;q=0.5
     *
     * Examples
     *
     * Accept-Charset: iso-8859-1
     * Accept-Charset: utf-8, iso-8859-1;q=0.5
     * Accept-Charset: utf-8, iso-8859-1;q=0.5, *;q=0.1
     *
     * }</pre>
     */
    public final String ACCEPT_CHARSET = "Accept-Charset";

    /**
     * Content negotiation
     * <br/>Request header
     * <br/><br/>
     * The encoding algorithm, usually a compression algorithm, that can be used on the resource sent back.
     * <pre>{@code
     * Accept-Encoding: gzip
     * Accept-Encoding: compress
     * Accept-Encoding: deflate
     * Accept-Encoding: br
     * Accept-Encoding: identity
     * Accept-Encoding: *
     *
     * // Multiple algorithms, weighted with the quality value syntax:
     * Accept-Encoding: deflate, gzip;q=1.0, *;q=0.5
     *
     * Examples
     *
     * Accept-Encoding: gzip
     * Accept-Encoding: gzip, compress, br
     * Accept-Encoding: br;q=1.0, gzip;q=0.8, *;q=0.1
     * }</pre>
     */
    public final String ACCEPT_ENCODING = "Accept-Encoding";

    /**
     * Content negotiation
     * <br/>Request header
     * <br/><br/>
     * Informs the server about the human language the server is expected to send back. This is a hint and is not necessarily under the full control of the user: the server should always pay attention not to override an explicit user choice (like selecting a language from a dropdown).
     * <pre>{@code
     * Accept-Language: <language>
     * Accept-Language: *
     *
     * // Multiple types, weighted with the quality value syntax:
     * Accept-Language: fr-CH, fr;q=0.9, en;q=0.8, de;q=0.7, *;q=0.5
     *
     * Examples
     *
     * Accept-Language: de
     * Accept-Language: de-CH
     * Accept-Language: en-US,en;q=0.5
     * }</pre>
     */
    public final String ACCEPT_LANGUAGE = "Accept-Language";

    /**
     * Controls
     * <br/>Request header
     * <br/><br/>
     * Indicates expectations that need to be fulfilled by the server to properly handle the request.
     * <pre>{@code
     * Expect: 100-continue
     * }</pre>
     * <p>
     * Examples<br/>
     * Large message body
     * <br/>
     * A client sends a request with a Expect header and waits for the server to respond before sending the message body.
     * <p>
     * PUT /somewhere/fun HTTP/1.1<br/>
     * Host: origin.example.com<br/>
     * Content-Type: video/h264<br/>
     * Content-Length: 1234567890987<br/>
     * Expect: 100-continue<br/>
     * <br/>
     * The server now checks the request headers and may respond with a 100 (Continue) response to instruct the client to go ahead and send the message body, or it will send a 417 (Expectation Failed) status if any of the expectations cannot be met.
     */
    public final String EXPECT = "Expect";

    /**
     * Cookies
     * <br/><br/>
     * Contains stored HTTP cookies previously sent by the server with the Set-Cookie header.
     * <pre>{@code
     * Cookie: <cookie-list>
     * Cookie: name=value
     * Cookie: name=value; name2=value2; name3=value3
     *
     * Examples
     *
     * Cookie: PHPSESSID=298zf09hf012fh2; csrftoken=u32t4o3tb3gg43; _gat=1;
     * }</pre>
     */
    public final String COOKIE = "Cookie";

    /**
     * Cookies
     * <br/>Response header
     * <br/><br/>
     * Send cookies from the server to the user-agent.
     * <pre>{@code
     * Set-Cookie: <cookie-name>=<cookie-value>
     * Set-Cookie: <cookie-name>=<cookie-value>; Expires=<date>
     * Set-Cookie: <cookie-name>=<cookie-value>; Max-Age=<non-zero-digit>
     * Set-Cookie: <cookie-name>=<cookie-value>; Domain=<domain-value>
     * Set-Cookie: <cookie-name>=<cookie-value>; Path=<path-value>
     * Set-Cookie: <cookie-name>=<cookie-value>; Secure
     * Set-Cookie: <cookie-name>=<cookie-value>; HttpOnly
     *
     * Set-Cookie: <cookie-name>=<cookie-value>; SameSite=Strict
     * Set-Cookie: <cookie-name>=<cookie-value>; SameSite=Lax
     * Set-Cookie: <cookie-name>=<cookie-value>; SameSite=None
     *
     * // Multiple directives are also possible, for example:
     * Set-Cookie: <cookie-name>=<cookie-value>; Domain=<domain-value>; Secure; HttpOnly
     *
     * Examples
     * Session cookie
     *
     * Session cookies are removed when the client shuts down. Cookies are session cookies if they don't specify the Expires or Max-Age directives.
     *
     * Set-Cookie: sessionId=38afes7a8
     *
     * Permanent cookie
     *
     * Instead of expiring when the client is closed, permanent cookies expire at a specific date (Expires) or after a specific length of time (Max-Age).
     *
     * Set-Cookie: id=a3fWa; Expires=Wed, 21 Oct 2015 07:28:00 GMT
     *
     * Set-Cookie: id=a3fWa; Max-Age=2592000
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie#Directives">Directives</a>
     */
    public final String SET_COOKIE = "Set-Cookie";

    /**
     * @deprecated Cookies
     * Contains an HTTP cookie previously sent by the server with the Set-Cookie2 header, but has been obsoleted. Use Cookie instead
     */
    @Deprecated
    public final String COOKIE_2 = "Cookie2";

    /**
     * @deprecated Cookies
     * Contains an HTTP cookie previously sent by the server with the Set-Cookie2 header, but has been obsoleted. Use Cookie instead
     */
    @Deprecated
    public final String SET_COOKIE_2 = "Set-Cookie2";

    /**
     * CORS
     * <br/>Response header
     * <br/><br/>
     * Indicates whether the response can be shared.
     * <pre>{@code
     * Access-Control-Allow-Origin: *
     * Access-Control-Allow-Origin: <origin>
     * Access-Control-Allow-Origin: null
     *
     * Examples
     *
     * Access-Control-Allow-Origin: *
     * Access-Control-Allow-Origin: https://developer.mozilla.org
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin#Directives">Directives</a>
     */
    public final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";

    /**
     * CORS
     * <br/>Response header
     * <br/><br/>
     * Indicates whether the response to the request can be exposed when the credentials flag is true.
     * <pre>{@code
     * Access-Control-Allow-Credentials: true
     *
     * Examples
     *
     * Allow credentials:
     *
     * Access-Control-Allow-Credentials: true
     *
     * Using XHR with credentials:
     *
     * var xhr = new XMLHttpRequest();
     * xhr.open('GET', 'http://example.com/', true);
     * xhr.withCredentials = true;
     * xhr.send(null);
     *
     * Using Fetch with credentials:
     *
     * fetch(url, {
     *   credentials: 'include'
     * })
     *
     * }</pre>
     */
    public final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";

    /**
     * CORS
     * <br/>Response header
     * <br/><br/>
     * Used in response to a preflight request to indicate which HTTP headers can be used when making the actual request.
     * <pre>{@code
     * Access-Control-Allow-Headers: <header-name>[, <header-name>]*
     * Access-Control-Allow-Headers: *
     *
     * Examples
     *
     * Access-Control-Allow-Headers: X-Custom-Header
     * }</pre>
     */
    public final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";

    /**
     * CORS
     * <br/>Response header
     * <br/><br/>
     * Specifies the methods allowed when accessing the resource in response to a preflight request.
     * <pre>{@code
     * Access-Control-Allow-Methods: <method>, <method>, ...
     * Access-Control-Allow-Methods: *
     *
     * Examples
     *
     * Access-Control-Allow-Methods: POST, GET, OPTIONS
     * Access-Control-Allow-Methods: *
     * }</pre>
     */
    public final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";

    /**
     * CORS
     * <br/>Response header
     * <br/><br/>
     * Indicates which headers can be exposed as part of the response by listing their names.
     * <pre>{@code
     * Access-Control-Expose-Headers: <header-name>, <header-name>, ...
     * Access-Control-Expose-Headers: *
     *
     * Examples
     *
     * To expose a non-CORS-safelisted request header,
     * you can specify:
     *
     * Access-Control-Expose-Headers: Content-Length
     *
     * To additionally expose a custom header,
     * like X-Kuma-Revision, you can specify
     * multiple headers separated by a comma:
     *
     * Access-Control-Expose-Headers: Content-Length, X-Kuma-Revision
     *
     * In requests without credentials,
     * you can also use a wildcard value:
     *
     * Access-Control-Expose-Headers: *
     *
     * However, this won't wildcard the Authorization header,
     * so if you need to expose that,
     * you will need to list it explicitly:
     *
     * Access-Control-Expose-Headers: *, Authorization
     * }</pre>
     */
    public final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";

    /**
     * CORS
     * <br/>Response header
     * <br/><br/>
     * Indicates how long the results of a preflight request can be cached.
     * <pre>{@code
     * Access-Control-Max-Age: <delta-seconds>
     *
     *     Examples
     *
     * Cache results of a preflight request for 10 minutes:
     *
     * Access-Control-Max-Age: 600
     *
     * }</pre>
     */
    public final String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";

    /**
     * CORS
     * <br/>Request header
     * <br/><br/>
     * Used when issuing a preflight request to let the server know which HTTP headers will be used when the actual request is made.
     * <pre>{@code
     * Access-Control-Request-Headers: <header-name>, <header-name>, ...
     *
     * Examples
     *
     * Access-Control-Request-Headers: X-PINGOTHER, Content-Type
     * }</pre>
     */
    public final String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";

    /**
     * CORS
     * <br/>Request header
     * <br/><br/>
     * Used when issuing a preflight request to let the server know which HTTP method will be used when the actual request is made.
     * <pre>{@code
     * Access-Control-Request-Method: <method>
     *
     * Examples
     *
     * Access-Control-Request-Method: POST
     * }</pre>
     */
    public final String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";

    /**
     * CORS
     * <br/>Request header
     * <br/><br/>
     * Indicates where a fetch originates from.
     * <pre>{@code
     * Origin: null
     * Origin: <scheme> "://" <hostname> [ ":" <port> ]
     *
     * Examples
     *
     * Origin: https://developer.mozilla.org
     * }</pre>
     */
    public final String ORIGIN = "Origin";

    /**
     * CORS
     * <br/>Response header
     * <br/><br/>
     * Specifies origins that are allowed to see values of attributes retrieved via features of the Resource Timing API, which would otherwise be reported as zero due to cross-origin restrictions.
     * <pre>{@code
     * Timing-Allow-Origin: *
     * Timing-Allow-Origin: <origin>[, <origin>]*
     *
     * Examples
     *
     * To allow any resource to see timing resources:
     *
     * Timing-Allow-Origin: *
     *
     * To allow https://developer.mozilla.org
     * to see timing resources, you can specify:
     *
     * Timing-Allow-Origin: https://developer.mozilla.org
     * }</pre>
     */
    public final String TIMING_ALLOW_ORIGIN = "Timing-Allow-Origin";

    /**
     * Do Not Track
     * <br/>Request header
     * <br/><br/>
     * Expresses the user's tracking preference.
     * <pre>{@code
     * DNT: 0
     * DNT: 1
     *
     * Examples
     * Reading Do Not Track status from JavaScript
     *
     * The user's DNT preference can also be read
     * from JavaScript using the
     * Navigator.doNotTrack property:
     *
     * navigator.doNotTrack; // "0" or "1"
     * }</pre>
     */
    public final String DNT = "DNT";

    /**
     * Do Not Track
     * <br/>Response header
     * <br/><br/>
     * Indicates the tracking status of the corresponding response.
     * <pre>{@code
     * Tk: !  (under construction)
     * Tk: ?  (dynamic)
     * Tk: G  (gateway or multiple parties)
     * Tk: N  (not tracking)
     * Tk: T  (tracking)
     * Tk: C  (tracking with consent)
     * Tk: P  (potential consent)
     * Tk: D  (disregarding DNT)
     * Tk: U  (updated)
     *
     * Examples
     *
     * A Tk header for a resource that claims
     * not to be tracking would look like:
     *
     * Tk: N
     * }</pre>
     */
    public final String TK = "Tk";

    /**
     * Downloads
     * <br/>Response header (for the main body)
     * <br/>General header (for a subpart of a multipart
     * <br/><br/>
     * Indicates if the resource transmitted should be displayed inline (default behavior without the header), or if it should be handled like a download and the browser should present a “Save As” dialog.
     * <pre>{@code
     * As a response header for the main body
     *
     * Content-Disposition: inline
     * Content-Disposition: attachment
     * Content-Disposition: attachment; filename="filename.jpg"
     *
     * As a header for a multipart body
     *
     * Content-Disposition: form-data
     * Content-Disposition: form-data; name="fieldName"
     * Content-Disposition: form-data; name="fieldName"; filename="filename.jpg"
     *
     * Examples
     *
     * A response triggering the "Save As" dialog:
     *
     * 200 OK
     * Content-Type: text/html; charset=utf-8
     * Content-Disposition: attachment; filename="cool.html"
     * Content-Length: 21
     *
     * <HTML>Save me!</HTML>
     *
     * -------------------------
     *
     * An example of an HTML form posted
     * using the multipart/form-data format
     * that makes use of the Content-Disposition header:
     *
     * POST /test.html HTTP/1.1
     * Host: example.org
     * Content-Type: multipart/form-data;boundary="boundary"
     *
     * --boundary
     * Content-Disposition: form-data; name="field1"
     *
     * value1
     * --boundary
     * Content-Disposition: form-data; name="field2"; filename="example.txt"
     *
     * value2
     * --boundary--
     * }</pre>
     */
    public final String CONTENT_DISPOSITION = "Content-Disposition";

    /**
     * Message body information
     * <br/>Entity header
     * <br/><br/>
     * The size of the resource, in decimal number of bytes.
     * <pre>{@code
     * Content-Length: <length>
     *
     * <length> The length in decimal number of octets.
     * }</pre>
     */
    public final String CONTENT_LENGTH = "Content-Length";

    /**
     * Message body information
     * <br/>Entity header
     * <br/><br/>
     * Indicates the media type of the resource.
     * <pre>{@code
     * Content-Type: text/html; charset=UTF-8
     * Content-Type: multipart/form-data; boundary=something
     *
     * Examples
     *
     * POST /foo HTTP/1.1
     * Content-Length: 68137
     * Content-Type: multipart/form-data; boundary=---------------------------974767299852498929531610575
     *
     * -----------------------------974767299852498929531610575
     * Content-Disposition: form-data; name="description"
     *
     * some text
     * -----------------------------974767299852498929531610575
     * Content-Disposition: form-data; name="myFile"; filename="foo.txt"
     * Content-Type: text/plain
     *
     * (content of the uploaded file foo.txt)
     * -----------------------------974767299852498929531610575--
     * }</pre>
     */
    public final String CONTENT_TYPE = "Content-Type";

    /**
     * Message body information
     * <br/>Entity header
     * <br/><br/>
     * Used to specify the compression algorithm.
     * <pre>{@code
     * Content-Encoding: gzip
     * Content-Encoding: compress
     * Content-Encoding: deflate
     * Content-Encoding: identity
     * Content-Encoding: br
     *
     * // Multiple, in the order in which they were applied
     * Content-Encoding: gzip, identity
     * Content-Encoding: deflate, gzip
     *
     * Examples
     * Compressing with gzip
     *
     * On the client side, you can advertise a list
     * of compression schemes that will be sent along
     * in an HTTP request. The Accept-Encoding header
     * is used for negotiating content encoding.
     *
     * Accept-Encoding: gzip, deflate
     *
     * The server responds with the scheme used,
     * indicated by the Content-Encoding response header.
     *
     * Content-Encoding: gzip
     *
     * Note that the server is not obligated
     * to use any compression method. Compression highly
     * depends on server settings and used server modules.
     * }</pre>
     */
    public final String CONTENT_ENCODING = "Content-Encoding";

    /**
     * Message body information
     * <br/>Entity header
     * <br/><br/>
     * Describes the human language(s) intended for the audience, so that it allows a user to differentiate according to the users' own preferred language.
     * <pre>{@code
     * Content-Language: de-DE
     * Content-Language: en-US
     * Content-Language: de-DE, en-CA
     *
     * Examples
     * Indicating the language a document is written in
     *
     * The global lang attribute is used on HTML elements
     * to indicate the language of an entire HTML document
     * or parts of it.
     *
     * <html lang="de">
     *
     * Do not use this meta element like this
     * for stating a document language:
     *
     * <!-- /!\ This is bad practice -->
     * <meta http-equiv="content-language" content="de">
     *
     * Indicating a target audience for a resource
     *
     * The Content-Language header is used to specify
     * the intended audience of the page,
     * and can indicate that this is more than one language.
     *
     * Content-Language: de, en
     *
     * }</pre>
     */
    public final String CONTENT_LANGUAGE = "Content-Language";

    /**
     * Message body information
     * <br/>Entity header
     * <br/><br/>
     * Indicates an alternate location for the returned data.
     * <pre>{@code
     * Content-Location: <url>
     *
     * Examples
     *
     * Accept: application/json, text/json   -->   Content-Location: /documents/foo.json
     * Accept: application/xml, text/xml   -->   Content-Location: /documents/foo.xml
     * Accept: text/plain, text/*  -->  Content-Location: /documents/foo.txt
     * }</pre>
     */
    public final String CONTENT_LOCATION = "Content-Location";

    /**
     * Proxies
     * <br/>Request header
     * <br/><br/>
     * Contains information from the client-facing side of proxy servers that is altered or lost when a proxy is involved in the path of the request.
     * <pre>{@code
     * Forwarded: by=<identifier>;for=<identifier>;host=<host>;proto=<http|https>
     *
     * Examples
     *
     * Using the Forwarded header
     *
     * Forwarded: for="_mdn"
     *
     * # case insensitive
     * Forwarded: For="[2001:db8:cafe::17]:4711"
     *
     * # separated by semicolon
     * Forwarded: for=192.0.2.60;proto=http;by=203.0.113.43
     *
     * # multiple values can be appended using a comma
     * Forwarded: for=192.0.2.43, for=198.51.100.17
     *
     * Transitioning from X-Forwarded-For to Forwarded
     *
     * X-Forwarded-For: 123.34.567.89
     * Forwarded: for=123.34.567.89
     *
     * X-Forwarded-For: 192.0.2.43, "[2001:db8:cafe::17]"
     * Forwarded: for=192.0.2.43, for="[2001:db8:cafe::17]"
     * }</pre>
     */
    public final String FORWARDED = "Forwarded";

    /**
     * Proxies
     * <br/>Request header
     * <br/><br/>
     * Identifies the originating IP addresses of a client connecting to a web server through an HTTP proxy or a load balancer.
     * <pre>{@code
     * X-Forwarded-For: <client>, <proxy1>, <proxy2>
     *
     * Examples
     *
     * X-Forwarded-For: 2001:db8:85a3:8d3:1319:8a2e:370:7348
     * X-Forwarded-For: 203.0.113.195
     * X-Forwarded-For: 203.0.113.195, 70.41.3.18, 150.172.238.178
     *
     * Other non-standard forms:
     *
     * # Used for some Google services
     * X-ProxyUser-Ip: 203.0.113.19
     * }</pre>
     */
    public final String X_FORWARDED_FOR = "X-Forwarded-For";

    /**
     * Proxies
     * <br/>Request header
     * <br/><br/>
     * Identifies the original host requested that a client used to connect to your proxy or load balancer.
     * <pre>{@code
     * X-Forwarded-Host: <host>
     *
     * Examples
     *
     * X-Forwarded-Host: id42.example-cdn.com
     * }</pre>
     */
    public final String X_FORWARDED_HOST = "X-Forwarded-Host";

    /**
     * Proxies
     * <br/>Request header
     * <br/><br/>
     * Identifies the protocol (HTTP or HTTPS) that a client used to connect to your proxy or load balancer.
     * <pre>{@code
     * X-Forwarded-Proto: <protocol>
     *
     * Examples
     *
     * X-Forwarded-Proto: https
     *
     * Other non-standard forms:
     *
     * # Microsoft
     * Front-End-Https: on
     *
     * X-Forwarded-Protocol: https
     * X-Forwarded-Ssl: on
     * X-Url-Scheme: https
     * }</pre>
     */
    public final String X_FORWARDED_PROTO = "X-Forwarded-Proto";

    /**
     * Proxies
     * <br/>General header
     * <br/><br/>
     * Added by proxies, both forward and reverse proxies, and can appear in the request headers and the response headers.
     * <pre>{@code
     * Via: [ <protocol-name> "/" ] <protocol-version> <host> [ ":" <port> ]
     * or
     * Via: [ <protocol-name> "/" ] <protocol-version> <pseudonym>
     *
     * Examples
     *
     * Via: 1.1 vegur
     * Via: HTTP/1.1 GWA
     * Via: 1.0 fred, 1.1 p.example.net
     * }</pre>
     */
    public final String VIA = "Via";

    /**
     * Redirects
     * <br/>Response header
     * <br/><br/>
     * Indicates the URL to redirect a page to.
     * <pre>{@code
     * Location: <url>
     *
     * Examples
     *
     * Location: /index.html
     * }</pre>
     */
    public final String LOCATION = "Location";

    /**
     * Request context
     * <br/>Request header
     * <br/><br/>
     * Contains an Internet email address for a human user who controls the requesting user agent.
     * <pre>{@code
     * From: <email>
     *
     * Examples
     *
     * From: webmaster@example.org
     * }</pre>
     */
    public final String FROM = "From";

    /**
     * Request context
     * <br/>Request header
     * <br/><br/>
     * Specifies the domain name of the server (for virtual hosting), and (optionally) the TCP port number on which the server is listening.
     * <pre>{@code
     * Host: <host>:<port>
     *
     * Examples
     *
     * Host: developer.cdn.mozilla.net
     * }</pre>
     */
    public final String HOST = "Host";

    /**
     * Request context
     * <br/>Request header
     * <br/><br/>
     * The address of the previous web page from which a link to the currently requested page was followed.
     * <pre>{@code
     * Referer: <url>
     *
     * Examples
     *
     * Referer: https://developer.mozilla.org/en-US/docs/Web/JavaScript
     * }</pre>
     */
    public final String REFERER = "Referer";

    /**
     * Request context
     * <br/>Response header
     * <br/><br/>
     * Governs which referrer information sent in the Referer header should be included with requests made.
     * <pre>{@code
     * Referrer-Policy: no-referrer
     * Referrer-Policy: no-referrer-when-downgrade
     * Referrer-Policy: origin
     * Referrer-Policy: origin-when-cross-origin
     * Referrer-Policy: same-origin
     * Referrer-Policy: strict-origin
     * Referrer-Policy: strict-origin-when-cross-origin
     * Referrer-Policy: unsafe-url
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy#Directives">Directives</a>
     */
    public final String REFERRER_POLICY = "Referrer-Policy";

    /**
     * Request context
     * <br/>Request header
     * <br/><br/>
     * Contains a characteristic string that allows the network protocol peers to identify the application type, operating system, software vendor or software version of the requesting software user agent.
     *
     * <pre>{@code
     * User-Agent: <product> / <product-version> <comment>
     *
     * Common format for web browsers:
     *
     * User-Agent: Mozilla/5.0 (<system-information>) <platform> (<platform-details>) <extensions>
     *
     *     Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0
     * Mozilla/5.0 (Macintosh; Intel Mac OS X x.y; rv:42.0) Gecko/20100101 Firefox/42.0
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/User-Agent/Firefox">Firefox user agent string reference.</a>
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/User-Agent#Syntax">Syntax.</a>
     */
    public final String USER_AGENT = "User-Agent";

    /**
     * Response context
     * <br/>Entity header
     * <br/><br/>
     * Lists the set of HTTP request methods supported by a resource.
     * <pre>{@code
     * Allow: <http-methods>
     *
     * Examples
     *
     * Allow: GET, POST, HEAD
     * }</pre>
     */
    public final String ALLOW = "Allow";

    /**
     * Response context
     * <br/>Response header
     * <br/><br/>
     * Contains information about the software used by the origin server to handle the request.
     * <pre>{@code
     * Server: <product>
     *
     * Examples
     *
     * Server: Apache/2.4.1 (Unix)
     * }</pre>
     */
    public final String SERVER = "Server";

    /**
     * Range requests
     * <br/>Response header
     * <br/><br/>
     * Indicates if the server supports range requests, and if so in which unit the range can be expressed.
     * <pre>{@code
     * Accept-Ranges: <range-unit>
     * Accept-Ranges: none
     *
     * Examples
     *
     * Accept-Ranges: bytes
     * }</pre>
     */
    public final String ACCEPT_RANGES = "Accept-Ranges";

    /**
     * Range requests
     * <br/>Request header
     * <br/><br/>
     * Indicates the part of a document that the server should return.
     * <pre>{@code
     * Range: <unit>=<range-start>-
     * Range: <unit>=<range-start>-<range-end>
     * Range: <unit>=<range-start>-<range-end>, <range-start>-<range-end>
     * Range: <unit>=<range-start>-<range-end>, <range-start>-<range-end>, <range-start>-<range-end>
     * Range: <unit>=-<suffix-length>
     *
     * Examples
     *
     * Requesting three ranges from the file.
     *
     * Range: bytes=200-1000, 2000-6576, 19000-
     *
     * Requesting the first 500 and last 500 bytes of the file.
     * The request may be rejected by the server
     * if the ranges overlap.
     *
     * Range: bytes=0-499, -500
     * }</pre>
     */
    public final String RANGE = "Range";

    /**
     * Range requests
     * <br/>Request header
     * <br/><br/>
     * Creates a conditional range request that is only fulfilled if the given etag or date matches the remote resource. Used to prevent downloading two ranges from incompatible version of the resource.
     * <pre>{@code
     * If-Range: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     * If-Range: <etag>
     *
     * Examples
     *
     * If-Range: Wed, 21 Oct 2015 07:28:00 GMT
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Range">Docs</a>
     */
    public final String IF_RANGE = "If-Range";

    /**
     * Range requests
     * <br/>Response header
     * <br/><br/>
     * Indicates where in a full body message a partial message belongs.
     * <pre>{@code
     * Content-Range: <unit> <range-start>-<range-end>/<size>
     * Content-Range: <unit> <range-start>-<range-end>/*
     * Content-Range: <unit> * /<size>
     *
     * Examples
     *
     * Content-Range: bytes 200-1000/67589
     * }</pre>
     */
    public final String CONTENT_RANGE = "Content-Range";
}
