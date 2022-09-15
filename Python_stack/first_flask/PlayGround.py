from flask import Flask , render_template
app=Flask(__name__)

@app.route("/play")
def levelOne():
    return render_template('playground.html')

@app.route("/play/<t>")
def levelTwo(t):
    return render_template('playground.html' , time=int(t))

@app.route("/play/<t>/<color>")
def levelThree(t, color):
    return render_template('playground.html' , time=int(t) , c=color)

if __name__=="__main__":
    app.run(debug=True)
