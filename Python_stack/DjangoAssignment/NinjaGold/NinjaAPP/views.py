from django.shortcuts import render , redirect
import random
def index(request):
    return render ( request , 'index.html')
def increasing(request):
    RandomNumber = random.randint(10, 20)
    if 'gold' in request.session:
        request.session['gold']+= RandomNumber
    else:
        request.session['gold']= RandomNumber
    if request.POST['which_form']== "Cave":
        request.session['Activity'] = 'You Entered a Cave and earned' , RandomNumber , 'golds'
        # Array.append(request.session['Activity'])
    elif request.POST['which_form']== "Farm":
        request.session['Activity'] = 'You Entered a Farm and earned' , RandomNumber , 'golds'
        # Array.append(request.session['Activity'])
    elif request.POST['which_form']== "House":
        request.session['Activity'] = 'You Entered a House and earned' , RandomNumber , 'golds'
        # Array.append(request.session['Activity'])
    return redirect('/')

def increasingORdecreasing(request):
        RandomNumber = random.randint(0, 50)
        RandomOperation=random.choice(['+' , '-'])
        if 'gold' in request.session:
            if RandomOperation=='+':
                request.session['gold'] += RandomNumber
                request.session['Activity'] = 'You Entered a Quest and earned' , RandomNumber , 'golds'
                # Array.append(request.session['Activity'])
            else:
                request.session['gold'] -= RandomNumber
                request.session['Activity'] = 'You Entered a Quest and Lost' , RandomNumber , 'Golds'
                # Array.append(request.session['Activity'])
        else:
            request.session['gold']= RandomNumber
        return redirect('/')
        




