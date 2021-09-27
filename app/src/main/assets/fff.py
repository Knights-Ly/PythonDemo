import sys
import you_get
import requests
requests.packages.urllib3.disable_warnings()
import ssl

try:
    _create_unverified_https_context = ssl._create_unverified_context
except AttributeError:
    # Legacy Python that doesn't verify HTTPS certificates by default
    pass
else:
    # Handle target environment that doesn't support HTTPS verification
    ssl._create_default_https_context = _create_unverified_https_context

def get_real_url(url):
    sys.argv.clear()
    sys.argv.append('--debug')
    sys.argv.append('--json')
    sys.argv.append(url)
    you_get.main()
    return sys.argv[3]