from turtle import color
from flask import Flask , render_template
app=Flask(__name__)

@app.route("/play")
def levelOne(x=3 , color="#9ec5f8"):
    return render_template('playground.html', time=int(x), c=color)

@app.route("/play/<x>")
def levelTwo(x , color="#9ec5f8"):
    return render_template('playground.html' , time=int(x) , c=color)

@app.route("/play/<x>/<color>")
def levelThree(x, color):
    return render_template('playground.html' , time=int(x) , c=color)

if __name__=="__main__":
    app.run(debug=True)
