Different information and examples of code. Everything refers to atomization of software. 
There is NO purpose to show good architecture or code writing. The only aim to show the simplest 
examples how to set up software and understand logic of approaches, so based on it start learning it.

**Example of API framework**

To run the tests you need to have a GitHub repository and generate an access token:
- Log in to GitHub
- Open the account settings
- Open "<> Developer settings"
- Open "Personal access tokens"
- Generate new token
- Copy the token shown as later only the name of token will be shown on UI

Token should be passed in a class Authentication

*About classes*
class Url:
has 2 overloaded methods, so you can put in parameters only base URI or URI with resources

class BodyGenerator: creates bodies for sending in put, post, delete requests. Can take Json from a file and convert to String, or create an object.

class Authentication: has a token for log in to GitHub

class CommonUtilityFunctions: different methods that can be used for all tests

package "resources": contains json files for creating requests
package "pojoClasses" contains objects for creating requests





