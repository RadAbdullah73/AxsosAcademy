from turtle import up
from flask import Flask , render_template 
app=Flask(__name__)

@app.route("/")
def levelOne(number=8 , color1 = "#000000" , color2="#FF0000"):
    return render_template( 'CheckerBoard.html',col=int(number),rows=int(number),c1=color1,c2=color2)

@app.route("//<number1>")
def levelTwo( number1 , number=8 , color1 = "#000000" , color2="#FF0000"):
    return render_template('CheckerBoard.html',col=int(number),rows=int(int(number1)),c1=color1,c2=color2)

@app.route("//<number3>/<number4>")
def levelThree( number3 , number4 , color1 = "#000000" , color2="#FF0000"):
    return render_template('CheckerBoard.html',col=int(int(number4)),rows=int(int(number3)),c1=color1,c2=color2)

# @app.route("/<number3>/<number4>/<color1>/<color2>")
# def levelFour( number3 , number4 , color1 , color2):
#     return render_template('CheckerBoard.html',col=int(int(number4)/2),rows= int(int(number3)/2),c1=color1,c2=color2)


@app.route("/<number3>/<number4>/<color1>/<color2>")
def levelfive( number3 , number4 , color1 , color2):
    return render_template('CheckerBoard.html',rows=int(number3),col=int(number4),c1=color1,c2=color2)

if __name__=="__main__":
    app.run(debug=True)
