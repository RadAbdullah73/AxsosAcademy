from flask import Flask , render_template ,session , redirect
app=Flask(__name__)

app.secret_key = "Hi World"
@app.route("/" )
def counting():
    if 'count' in session:
        session['count'] +=1
    else:
        session['count'] = 1 
    return  render_template('counter.html', count=(session['count'])) 
@app.route("/destroy")
def delete():
    session.pop('count')	
    return redirect('/')
@app.route("/ByTwo")
def AddTwo():
    session['count'] +=1
    return  redirect ('/')
@app.route("/Reset")
def Reset():
    session['count'] =0
    return  redirect ('/')
if __name__=="__main__":
    app.run(debug=True)

