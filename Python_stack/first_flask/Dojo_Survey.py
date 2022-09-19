from urllib import request
from flask import Flask , render_template , request , redirect , session
app=Flask(__name__)

@app.route("/form")
def Form():
    return render_template ("Dojo_Survey.html")

@app.route("/handleform" , methods=['post'])
def form_one():
    print(request.form)
    name_from_form=request.form['name']
    location_from_form=request.form['location']
    language_from_form=request.form['language']
    comment_from_form=request.form['cmt']
    return render_template('Page.html' , fname=name_from_form , flocation=location_from_form , flanguage=language_from_form , fcomment=comment_from_form) 


if __name__=="__main__":
    app.run(debug=True)