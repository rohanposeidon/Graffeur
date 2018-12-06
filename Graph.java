import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
class Graph implements Graph_Interface
{
	final char axi=134,yes='X',no=' ';
	public static double xl, xh, yl, yh, hx, hy, graph[][];
	static final double pi = 3.141592653589, PI = 3.141592653589, e = 2.718281828459, E = 2.718281828459, phi = 1.618033988749, PHI = 1.618033988749;
	int nx, ny;
	char plot[][], plot2[][];
	public boolean loggedin = false;
	static boolean easter = true;
	Graph()
	{
		nx = 1082;
		ny = 1082;
		yl = -10.0;
		yh = 10.0;
		xh = nx / ny * yh;
		xl = - xh;
		graph = new double[ny][nx];
		plot = new char[ny][nx];
		plot2 = new char[ny][nx];
	}
	static double abs(double x)
	{
		return Math.abs(x);
	}
	static double sin(double x)
	{
		return Math.sin(x);
	}
	static double pow(double x,double y)
	{
		return Math.pow(x,y);
	}
	static double cos(double x)
	{
		return Math.cos(x);
	}
	static double tan(double x)
	{
		return Math.tan(x);
	}
	static double csc(double x)
	{
		return 1/Math.sin(x);
	}
	static double cosec(double x)
	{
		return 1/Math.sin(x);
	}
	static double sec(double x)
	{
		return 1/Math.cos(x);
	}
	static double cot(double x)
	{
		return 1/Math.tan(x);
	}
	static double arcsin(double x)
	{
		return Math.asin(x);
	}
	static double arccos(double x)
	{
		return Math.acos(x);
	}
	static double arctan(double x)
	{
		return Math.atan(x);
	}
	static double arccsc(double x)
	{
		return Math.asin(1/x);
	}
	static double arccosec(double x)
	{
		return Math.asin(1/x);
	}
	static double arcsec(double x)
	{
		return Math.acos(1/x);
	}
	static double arccot(double x)
	{
		return Math.atan(1/x);
	}
	static double arcsinh(double x)
	{
		return Math.log(x+Math.sqrt(x*x+1));
	}
	static double arccosh(double x)
	{
		return Math.log(x+Math.sqrt(x*x-1));
	}
	static double arctanh(double x)
	{
		return Math.log((1-x)/(1+x))/2;
	}
	static double arccoth(double x)
	{
		return Math.log((1+x)/(1-x))/2;
	}
	static double arcsech(double x)
	{
		return arccosh(1/x);
	}
	static double arccosech(double x)
	{
		return arcsinh(1/x);
	}
	static double arccsch(double x)
	{
		return arcsinh(1/x);
	}
	static double asin(double x)
	{
		return Math.asin(x);
	}
	static double acos(double x)
	{
		return Math.acos(x);
	}
	static double atan(double x)
	{
		return Math.atan(x);
	}
	static double acsc(double x)
	{
		return Math.asin(1/x);
	}
	static double acosec(double x)
	{
		return Math.asin(1/x);
	}
	static double asec(double x)
	{
		return Math.acos(1/x);
	}
	static double acot(double x)
	{
		return Math.atan(1/x);
	}
	static double asinh(double x)
	{
		return Math.log(x+Math.sqrt(x*x+1));
	}
	static double acosh(double x)
	{
		return Math.log(x+Math.sqrt(x*x-1));
	}
	static double atanh(double x)
	{
		return Math.log((1-x)/(1+x))/2;
	}
	static double acoth(double x)
	{
		return Math.log((1+x)/(1-x))/2;
	}
	static double asech(double x)
	{
		return arccosh(1/x);
	}
	static double acosech(double x)
	{
		return arcsinh(1/x);
	}
	static double acsch(double x)
	{
		return arcsinh(1/x);
	}
	static double sqrt(double x)
	{
		return Math.sqrt(x);
	}
	static double cbrt(double x)
	{
		return Math.cbrt(x);
	}
	static double ceil(double x)
	{
		return Math.ceil(x);
	}
	static double floor(double x)
	{
		return Math.floor(x);
	}
	static double sinh(double x)
	{
		return Math.sinh(x);
	}
	static double cosh(double x)
	{
		return Math.cosh(x);
	}
	static double tanh(double x)
	{
		return Math.tanh(x);
	}
	static double exp(double x)
	{
		return Math.exp(x);
	}
	static double log(double x)
	{
		return Math.log10(x);
	}
	static double ln(double x)
	{
		return Math.log(x);
	}
	static double logb(double x,double b)
	{
		return Math.log(x)/Math.log(b);
	}
	static double max(double x,double y)
	{
		return Math.max(x,y);
	}
	static double min(double x,double y)
	{
		return Math.min(x,y);
	}
	static double signum(double x)
	{
		return Math.signum(x);
	}
	public double f(double x)
	{
		return Function.fu(x);
	}
	public boolean createaccount(String username,String password)
	{
		BufferedReader input = null;
		try
		{
			input = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			while ((line=input.readLine())!=null)
			{
				line = line.trim();
				if (line.length() > 0)
					if (line.split(" ")[0].equals(username))
					{
						input.close();
						return false;
					}
			}
			String txt = new String(username + " " + password + "\n");
			Files.write(Paths.get("data.txt"), txt.getBytes(), StandardOpenOption.APPEND);
			loggedin=true;
			input.close();
			return true;
		}
		catch (IOException e)
		{
		}
		return false;
	}
	public boolean login(String username,String password)
	{
		BufferedReader input = null;
		try
		{
			input = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			while ((line=input.readLine())!=null)
			{
				line = line.trim();
				if (line.split(" ")[0].equals(username) && line.split(" ")[1].equals(password))
				{
					loggedin=true;
					input.close();
					return true;
				}
			}
			input.close();
			return false;
		}
		catch(Exception e)
		{
		}
		return false;
	}
	public void plotGraph()
	{
		int i, j, pos = 0;
		hx = (xh - xl) / (nx - 1);
		hy = (yh - yl) / (ny - 1);
		double val, x, y;
		for (i = 0, x = xl; i < nx; plot[pos][i] = yes, plot2[pos][i] = yes, i++, x += hx)
			for (val = f(x), j = 0, y = yl; j < ny; j++, y += hy)
			{
				plot[j][i] = no;
				plot2[j][i] = no;
				graph[j][i] = abs(y - val);
				pos = (j == 0 || graph[j][i] < graph[pos][i]) ? j : pos;
			}
		makeContinuous();
		plotAxes();
	}
	public void makeContinuous()
	{
		int i, j;
		for (i = 0; i < nx - 1; i++)
		{
			for (j = 1; j>0 && j < ny - 1;)
				if (plot[j][i] == yes && plot[j - 1][i + 1] != yes && plot[j][i + 1] != yes && plot[j + 1][i + 1] != yes)
				{
					if (graph[j - 1][i + 1] < graph[j + 1][i + 1])
						plot[--j][i] = yes;
					else
						plot[++j][i] = yes;
				}
				else if (plot[j][i] == yes && (plot[j - 1][i + 1] == yes || plot[j][i + 1] == yes || plot[j + 1][i + 1] == yes))
					j = 0;
				else
					j++;
		}
		for (i = nx - 1; i > 0; i--)
		{
			for (j = 1; j>0 && j < ny - 1;)
				if (plot2[j][i] == yes && plot2[j - 1][i - 1] != yes && plot2[j][i - 1] != yes && plot2[j + 1][i - 1] != yes)
				{
					if (graph[j - 1][i - 1] < graph[j + 1][i - 1])
						plot2[--j][i] = yes;
					else
						plot2[++j][i] = yes;
				}
				else if (plot2[j][i] == yes && (plot2[j - 1][i - 1] == yes || plot2[j][i - 1] == yes || plot2[j + 1][i - 1] == yes))
					j = 0;
				else
					j++;
		}
		for (i = 0; i < nx; i++)
			for (j = 0; j < ny; j++)
				if (i>0&&plot[j][i]==yes&&plot2[j][i-1]==yes)
					continue;
				else if (i<nx-1&&plot[j][i]==yes&&plot2[j][i+1]==yes)
					continue;
				else if (plot[j][i]==yes&&plot2[j][i]==no)
					plot[j][i] = no;
	}
	public void plotAxes()
	{
		int i,del;
		if (Double.compare(yl, 0)<=0&&Double.compare(0, yh)<=0)
		{
			for (del = 0, i = 1; i < ny; i++)
				del = abs(yl+del * hy) > abs(yl+i*hy) ? i : del ;
			for (i = 0; i < nx; i++)
				plot[del][i] = plot[del][i] == yes ? plot[del][i] : axi;
		}
		if (Double.compare(xl, 0)<=0&&Double.compare(0, xh)<=0)
		{
			for (del = 0, i = 1; i < nx; i++)
				del = abs(xl + del * hx) > abs(xl + i*hx) ? i : del;
			for (i = 0; i < ny; i++)
				plot[i][del] = plot[i][del] == yes ? plot[i][del] : axi;
		}
	}
	public void printGraph()
	{
		plotGraph();
		int width = nx;
		int height = ny-2;
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		File f = null;
		for(int y = 0; y < height; y++)
		{
			for(int x = 0; x < width; x++)
			{
				int a = 255;
				int r = (plot[y+1][x]==yes||plot[y+1][x]==axi)?255:0;
				int g = (plot[y+1][x]==yes)?255:0;
				int b = (plot[y+1][x]==yes)?255:0;
				int p = (a<<24) | (r<<16) | (g<<8) | b;
				img.setRGB(x, height - y - 1, p);
			}
		}
		try
		{
			f = new File("graph.png");
			ImageIO.write(img, "png", f);
			//Runtime.getRuntime().exec("cmd /k graph.png");
		}
		catch(Exception e)
		{
		}
	}
	static double video(double x)
	{
		if (easter==true)
			try
			{
				Runtime.getRuntime().exec("cmd /k easter.txt");
				easter = false;
			}
			catch (Exception E)
			{
			}
		return 0;
	}
	public void zoomIn()
	{
		zoomInX();
		zoomInY();
	}
	public void zoomOut()
	{
		zoomOutX();
		zoomOutY();
	}
	public void zoomInX()
	{
		xl = xl + hx;
		xh = xh - hx;
		hx = (xh - xl) / (nx - 1);
	}
	public void zoomOutX()
	{
		xl = xl - hx;
		xh = xh + hx;
		hx = (xh - xl) / (nx - 1);
	}
	public void zoomInY()
	{
		yl = yl + hy;
		yh = yh - hy;
		hy = (yh - yl) / (ny - 1);
	}
	public void zoomOutY()
	{
		yl = yl - hy;
		yh = yh + hy;
		hy = (yh - yl) / (ny - 1);
	}
	public void zoomInX(double fact)
	{
		xl = xl / fact;
		xh = xh / fact;
		hx = (xh - xl) / (nx - 1);
	}
	public void zoomInY(double fact)
	{
		yl = yl / fact;
		yh = yh / fact;
		hy = (yh - yl) / (ny - 1);
	}
	public void zoomIn(double fact)
	{
		zoomInX(fact);
		zoomInY(fact);
	}
	public void zoomOutX(double fact)
	{
		xl = xl * fact;
		xh = xh * fact;
		hx = (xh - xl) / (nx - 1);
	}
	public void zoomOutY(double fact)
	{
		yl = yl * fact;
		yh = yh * fact;
		hy = (yh - yl) / (ny - 1);
	}
	public void zoomOut(double fact)
	{
		zoomOutX(fact);
		zoomOutY(fact);
	}
	public void panRight()
	{
		xh = xh - hx;
		xl = xl - hx;
	}
	public void panLeft()
	{
		xl = xl + hx;
		xh = xh + hx;
	}
	public void panUp()
	{
		yl = yl - hy;
		yh = yh - hy;
	}
	public void panDown()
	{
		yl = yl + hy;
		yh = yh + hy;
	}
	public void panI()
	{
		panUp();
		panRight();
	}
	public void panII()
	{
		panLeft();
		panUp();
	}
	public void panIII()
	{
		panLeft();
		panDown();
	}
	public void panIV()
	{
		panRight();
		panDown();
	}
	public void panRight(int pix)
	{
		xh = xh - pix*hx;
		xl = xl - pix*hx;
	}
	public void panLeft(int pix)
	{
		xl = xl + pix*hx;
		xh = xh + pix*hx;
	}
	public void panUp(int pix)
	{
		yl = yl - pix*hy;
		yh = yh - pix*hy;
	}
	public void panDown(int pix)
	{
		yl = yl + pix*hy;
		yh = yh + pix*hy;
	}
	public void panI(int pix)
	{
		panUp(pix);
		panRight(pix);
	}
	public void panII(int pix)
	{
		panLeft(pix);
		panUp(pix);
	}
	public void panIII(int pix)
	{
		panLeft(pix);
		panDown(pix);
	}
	public void panIV(int pix)
	{
		panRight(pix);
		panDown(pix);
	}
	public void panI(int pix,int piy)
	{
		panUp(piy);
		panRight(pix);
	}
	public void panII(int pix,int piy)
	{
		panLeft(pix);
		panUp(piy);
	}
	public void panIII(int pix,int piy)
	{
		panLeft(pix);
		panDown(piy);
	}
	public void panIV(int pix,int piy)
	{
		panRight(pix);
		panDown(piy);
	}
	public void reset()
	{
		yl = -10.0;
		yh = 10.0;
		xh = nx / ny * yh;
		xl = - xh;
	}
	public void exportImage(String s)
	{
		if (loggedin)
			try
			{
				String str = new String("cmd /k copy graph.png \"Downloads/" + s + ".png\"");
				Runtime.getRuntime().exec(str);
			}
			catch (Exception e)
			{
			}
	}
	public double integrate(double low, double high)
	{
		double h = (high - low) / 99999, sum = f(low) + f(high);
		for (int i = 1; i < 99999; i += 2)
			sum += 4 * f(h * i + low) + 2 * f(h * i + h + low);
		return sum * h / 3;
	}
}