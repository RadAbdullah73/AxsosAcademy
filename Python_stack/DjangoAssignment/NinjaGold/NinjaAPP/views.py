from datetime import datetime
from django.shortcuts import render , redirect
import random
from time import gmtime, strftime
def index(request):
    return render ( request , 'index.html')
def increasing(request):
    RandomNumber = random.randint(10, 20)
    if 'gold' in request.session:
        request.session['gold']+= RandomNumber
    else: 
        request.session['gold']= RandomNumber
    if request.POST['which_form']== "Cave":
        request.session['Activity'] = f"You Entered a Cave and earned {RandomNumber} Golds." + '(' + str(datetime.now().strftime("%b-%d-%Y %H:%M-%p")) + ')'
        request.session['list']+=[request.session['Activity']]
    elif request.POST['which_form']== "Farm":
        request.session['Activity'] = f"You Entered a Farm and earned {RandomNumber} Golds." + '(' + str(datetime.now().strftime("%b-%d-%Y %H:%M-%p")) + ')'
        request.session['list']+=[request.session['Activity']]
    elif request.POST['which_form']== "House":
        request.session['Activity'] = f"You Entered a House and earned {RandomNumber} Golds." + '(' + str(datetime.now().strftime("%b-%d-%Y %H:%M-%p")) + ')'
        request.session['list']+=[request.session['Activity']]
    return redirect('/')
def increasingORdecreasing(request): #Entering The Quest 
        RandomNumber = random.randint(0, 50)
        RandomOperation=random.choice(['+' , '-']) 
        if 'gold' in request.session:
            if RandomOperation=='+':
                request.session['gold'] += RandomNumber
                request.session['Activity'] = f"You Entered a Quest and earned {RandomNumber} Golds." + '(' + str(datetime.now().strftime("%b-%d-%Y %H:%M-%p")) + ')'
                request.session['list']+=[request.session['Activity']]
            else:
                request.session['gold'] -= RandomNumber
                request.session['Activity'] = f"You Failed a Quest and Lost {RandomNumber} Golds." + '(' + str(datetime.now().strftime("%b-%d-%Y %H:%M-%p")) + ')'
                request.session['list']+=[request.session['Activity']]
        else:
            request.session['gold']= RandomNumber
        return redirect('/')
        




