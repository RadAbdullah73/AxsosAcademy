from flask import Flask
app=Flask(__name__)

@app.route("/")
def index():
    return "hello world , first flask app!"

@app.route("/about")
def about():
    return "hiiiiiiiiiiiiiiii"

if __name__=="__main__":
    app.run(debug=True)


