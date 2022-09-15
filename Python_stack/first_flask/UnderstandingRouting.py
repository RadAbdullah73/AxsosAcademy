from flask import Flask , render_template
app=Flask(__name__)

@app.route("/")
def index():
    return "hello world"

@app.route("/dojo")
def HelloDojo():
    return "Dojo"

@app.route("/say/flask")
def HelloFlask():
    return "Hi Flask"

@app.route("/hello/<name>/<time>")
def RepeatName(name,time):
    return render_template('under.html' , sname=name,stime=int(time)) 

if __name__=="__main__":
    app.run(debug=True)









