import * as React from 'react';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';
import { CardActionArea } from '@mui/material';

export default function Account({user}) {
    let recipeNames = ""
    try{
        for (let i = 0; i < user.recipeList.length; i++) {
            const element = user.recipeList[i];
            if(!user.recipeList[i+1]){
                recipeNames += element.name+"."
                break;
            }
            recipeNames += element.name+", "
        }
    }catch(err){
        console.log(err)
    }
    // console.log(user)
    return (
        <Card sx={{ maxWidth: 345 }}>
        <CardActionArea>
            <CardMedia
            component="img"
            height="250"
            image={user.photo}
            alt="green iguana"
            />
            <CardContent>
            <Typography gutterBottom variant="h5" component="div">
                {user.name}
            </Typography>
            <Typography variant="body2" color="text.secondary">
                {user.email}
            </Typography>
            <Typography variant="body2" color="text.secondary">
                {user.age} y.o
            </Typography>
            <Typography variant="body2" color="text.secondary">
                Recipes: {recipeNames}
            </Typography>
            </CardContent>
        </CardActionArea>
        </Card>
    );
    }
